package org.example.eventmanagementsystem.Services;

import org.example.eventmanagementsystem.Controllers.ProductClient;
import org.example.eventmanagementsystem.DTO.EventDTO;
import org.example.eventmanagementsystem.DTO.ProductDTO;
import org.example.eventmanagementsystem.Exceptions.EventNotFoundException;
import org.example.eventmanagementsystem.Models.Event;
import org.example.eventmanagementsystem.Repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private ProductClient productClient;

    public List<EventDTO> getAllEvents() {
        return eventRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public EventDTO getEventById(String id) {
        return eventRepository.findById(id)
                .map(this::convertToDTO)
                .orElseThrow(() -> new EventNotFoundException(id));
    }

    public EventDTO createEvent(EventDTO eventDTO) {
        Event event = new Event(eventDTO);
        return convertToDTO(eventRepository.save(event));
    }

    public EventDTO updateEvent(String id, EventDTO eventDTO) {
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new EventNotFoundException(id));
        event.updateFromDTO(eventDTO);
        return convertToDTO(eventRepository.save(event));
    }

    public void deleteEvent(String id) {
        eventRepository.deleteById(id);
    }

    public ProductDTO getProductByEventId(String eventId) {
        Event event = eventRepository.findById(eventId)
                .orElseThrow(() -> new EventNotFoundException(eventId));
        return productClient.getProductById(event.getProductId());
    }

    private EventDTO convertToDTO(Event event) {
        return new EventDTO(
                event.getId(),
                event.getName(),
                event.getDescription(),
                event.getDate(),
                event.getLocation(),
                event.getProductId()
        );
    }
}

