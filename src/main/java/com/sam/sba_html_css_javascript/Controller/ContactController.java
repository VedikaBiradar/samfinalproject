package com.sam.sba_html_css_javascript.Controller;


import com.sam.sba_html_css_javascript.Entity.ContactMessage;
import com.sam.sba_html_css_javascript.Service.ContactMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    private final ContactMessageService contactMessageService;

    @Autowired
    public ContactController(ContactMessageService contactMessageService) {
        this.contactMessageService = contactMessageService;
    }

    @GetMapping("/index")
    public String showIndexForm(Model model) {
        return "index";
    }

    @GetMapping("/contact")
    public String showContactForm(Model model) {
        model.addAttribute("contactMessage", new ContactMessage());
        return "contact";
    }

    @PostMapping("/contact")
    public String submitContactForm(@ModelAttribute ContactMessage contactMessage) {
        contactMessageService.saveMessage(contactMessage);
        return "redirect:/contact?success";
    }

    @GetMapping("/contact/list")
    public String showListOfContactMessages(Model model) {
        model.addAttribute("contactMessages", contactMessageService.getAllMessages());
        return "contactless";
    }


    @GetMapping("/about")
    public String showAboutus(Model model) {
        return "about";
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        return "login";
    }

    @GetMapping("/calculate")
    public String showCalculateFeeForm(Model model) {

        return "calculate";
    }

   @GetMapping("/welcome")
    public String showWelcomeForm(Model model) {
        return "welcome";
   }

}
