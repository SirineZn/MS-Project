package org.example.eventmanagementsystem.Controllers;

import org.example.eventmanagementsystem.DTO.EventDTO;
import org.example.eventmanagementsystem.DTO.ProductDTO;
import org.example.eventmanagementsystem.Services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<EventDTO> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{id}")
    public EventDTO getEventById(@PathVariable String id) {
        return eventService.getEventById(id);
    }

    @PostMapping
    public EventDTO createEvent(@RequestBody EventDTO eventDTO) {
        return eventService.createEvent(eventDTO);
    }

    @PutMapping("/{id}")
    public EventDTO updateEvent(@PathVariable String id, @RequestBody EventDTO eventDTO) {
        return eventService.updateEvent(id, eventDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable String id) {
        eventService.deleteEvent(id);
    }

    @GetMapping("/{id}/product")
    public ProductDTO getProductByEventId(@PathVariable String id) {
        return eventService.getProductByEventId(id);
    }
}

