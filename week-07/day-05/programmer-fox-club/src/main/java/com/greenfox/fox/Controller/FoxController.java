package com.greenfox.fox.Controller;

import com.greenfox.fox.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {
  @Autowired
  private Fox fox;

  @RequestMapping("/changeDiet")
  public String changeDiet(@RequestParam("food") String food, @RequestParam("drink") String drink) {
    fox.setFood(food);
    fox.setDrink(drink);
    return "redirect:/";
  }

  @RequestMapping("/addTrick")
  public String addTrick(@RequestParam("trick") String trick) {
    fox.addTrick(trick);
    return "redirect:/";
  }

  @RequestMapping("/revive")
  public String revive() {
    fox.reset();
    return "redirect:/";
  }

  @RequestMapping("/finger")
  public String finger() {
    if (!fox.isVampire()) {
      fox.setImage("greenfox-finger.png");
    } else {
      fox.setImage("uncooperative-vampire.png");
    }
    return "redirect:/";
  }

  @RequestMapping("/sit")
  public String sit() {
    if (!fox.isVampire()) {
      fox.setImage("greenfox.png");
    } else {
      fox.setImage("uncooperative-vampire.png");
    }
    return "redirect:/";
  }

  @RequestMapping("/sing")
  public String sing() {
    if (!fox.isVampire()) {
      fox.setImage("greenfox-sing.png");
    } else {
      fox.setImage("uncooperative-vampire.png");
    }
    return "redirect:/";
  }
}
