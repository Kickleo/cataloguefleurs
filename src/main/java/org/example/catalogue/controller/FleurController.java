package org.example.catalogue.controller;

import org.example.catalogue.model.Fleur;
import org.example.catalogue.repository.FleurRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
public class FleurController {

    private final FleurRepository fleurRepository;


    public FleurController(FleurRepository fleurRepository) {this.fleurRepository = fleurRepository;}

    @GetMapping("/fleurs/{id}")
    public Fleur getFleur(@PathVariable String id) {
        Optional<Fleur> fleur = fleurRepository.findById(id);
        return fleur.orElse(null);
    }

    @GetMapping("/fleurs/{id}/image")
    public String getImageFleur(@PathVariable String id) {
        Optional<Fleur> fleur = fleurRepository.findById(id);
        return fleur.map(Fleur::getImage).orElse(null);
    }

    @GetMapping("/fleurs")
    public Iterable<Fleur> getAllFleurs() {
        return fleurRepository.findAll();
    }

    @PostMapping("/fleurs")
    public Fleur addFleur(@RequestBody Fleur fleur) {
        return fleurRepository.save(fleur);
    }

    @PutMapping("/fleurs/{id}")
    public Fleur updateFleur(@PathVariable String id, @RequestBody Fleur fleur) {

        Optional<Fleur> optionalFleur = fleurRepository.findById(id);
        if (optionalFleur.isPresent()) {
            Fleur updatedFleur = optionalFleur.get();

            String name = fleur.getName();
            if (name != null) {
                updatedFleur.setName(name);
            }

            String location = fleur.getLocation();
            if (location != null) {
                updatedFleur.setLocation(location);
            }

            Integer price = fleur.getPrice();
            if (price != null) {
                updatedFleur.setPrice(price);
            }

            Integer quantity = fleur.getQuantity();
            if (quantity != null) {
                updatedFleur.setQuantity(quantity);
            }

            String image = fleur.getImage();
            if (image != null) {
                updatedFleur.setImage(image);
            }

            fleurRepository.save(updatedFleur);
            return updatedFleur;

        }
        return null;
    }

    @DeleteMapping("fleurs/{id}")
    public void deleteFleur(@PathVariable String id) {
        fleurRepository.deleteById(id);
    }

}
