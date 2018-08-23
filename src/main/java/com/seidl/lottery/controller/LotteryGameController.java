/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seidl.lottery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Áron
 */
@Controller
public class LotteryGameController {

    @RequestMapping(path = "/game", method = RequestMethod.GET)
    public String openLotteryGamePage() {
        return "game";
    }

}
