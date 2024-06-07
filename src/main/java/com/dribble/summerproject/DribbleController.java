package com.dribble.summerproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DribbleController {

    @Autowired
    private Repo repo;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/dribble")
    public String getMVP(@RequestParam(name = "mwaka")int mwaka, Model model) {
        MVP mvp = repo.findByMwaka(mwaka);
        if (mvp != null) {
            model.addAttribute("name", mvp.getName());
            model.addAttribute("imageURL", mvp.getImageURL());
        } else if (mwaka < 1949){
            model.addAttribute("name", "NBA wasn't founded yet!");
            model.addAttribute("imageURL", "");
        } else {
            model.addAttribute("name", "Time will tell!");
            model.addAttribute("imageURL", "");
        }
        return "mvp";
    }
}
