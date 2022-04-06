package com.example.oenskeseddel.DATA.Bruger;


import com.example.oenskeseddel.DATA.Arbiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.Objects;

@Controller
public class BrugerController {
    Arbiter arbiter = new Arbiter();

    @Autowired
    private BrugerService brugerService;

    @GetMapping("/LogInd")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("LogInd");
        modelAndView.addObject("bruger", new Bruger());
        return modelAndView;
    }
    @PostMapping("/LogInd")
    public String login(@ModelAttribute("bruger") Bruger bruger){
        Bruger oauthBruger = brugerService.login(bruger.getUsername(),bruger.getPassword());
        System.out.println(oauthBruger);
        if(Objects.nonNull(oauthBruger)){
            return "redirect:/";
        }else{
            return "redirect:/LogIn";
        }

    }
    @PostMapping("/Opret Bruger")
    public String OpretBruger(@ModelAttribute Bruger bruger) throws SQLException {

        arbiter.createUser(bruger.getEmail(), bruger.getUsername(), bruger.getPassword(), bruger.getPasswordRE());

        return "OpretBruger";
    }
}
