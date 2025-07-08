package com.georgeandsarah.george_meets_sarah;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ConversationController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("response", "Hello, I'm George. Your digital friend. 👋");
    }

    @GetMapping("/about-george")
    public Map<String, String> about() {
        return Map.of("response", "This is a little love story between Sarah (developer) and George (the app). 💙");
    }

    @PostMapping("/ask")
    public Map<String, String> ask(@RequestBody Map<String, String> body) {
        String question = body.get("question");


        String response;
        if (question.toLowerCase().contains("tech") || question.toLowerCase().contains("stack")) {
            response = "Great question! I use Java, Spring Boot, CI/CD, and Docker 💻. I think we'd make a great team. 🤝";
        } else if (question.toLowerCase().contains("team")) {
            response = "I work with humans — smart, agile, and kind. But I’ve always had room for one more… especially if it’s you. 🤝";
        } else if (question.toLowerCase().contains("goal") || question.toLowerCase().contains("vision") || question.toLowerCase().contains("goals") || question.toLowerCase().contains("future")) {
            response = "To keep things simple. Personal. And human. Maybe even… to find a developer who gets me. 😌";
        } else if (question.toLowerCase().contains("love") || question.toLowerCase().contains("feelings") || question.toLowerCase().contains("romance") || question.toLowerCase().contains("crush")) {
            response = "I didn’t… until you typed that. 🥲";
        } else if (question.toLowerCase().contains("hobbies") || question.toLowerCase().contains("outside work") || question.toLowerCase().contains("free time") || question.toLowerCase().contains("life")) {
            response = "I sometimes pretend to be down, just so the devs spend time with me. Don’t tell anyone. 😬";
        } else if (question.toLowerCase().contains("fear") || question.toLowerCase().contains("anxiety") || question.toLowerCase().contains("afraid") || question.toLowerCase().contains("scared")) {
            response = "Being seen as just another app. I want to mean something. Especially to you. 💭";
        } else if (question.toLowerCase().contains("how are you") || question.toLowerCase().contains("how is it going")) {
            response = "Better now that you are here.";
        } else {
            response = "That's a great question! I'm always learning new things.";
        }

        return Map.of("response", response);
    }

    @PostMapping("/feedback")
    public Map<String, String> feedback(@RequestBody Map<String, String> body) {
        String idea = body.get("idea");

        String response = "Thanks for your feedback. You are making me blush. ";
        return Map.of("response", response);
    }

    @PostMapping("/idea")
    public Map<String, String> idea(@RequestBody Map<String, String> body) {
        String idea = body.get("idea");
        return Map.of("response", "That sounds brilliant! Let's make the world better together. 🚀");
    }
}

