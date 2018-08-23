/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seidl.lottery.controller;

import com.seidl.lottery.dtos.WinnerTicketsDto;
import com.seidl.lottery.model.LotteryTicket;
import com.seidl.lottery.service.LotteryGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Áron
 */
@RestController
@RequestMapping("/rest")
public class LotteryGameRestController {

    @Autowired
    LotteryGameService lotteryGameService;

    @RequestMapping(path = "/game", method = RequestMethod.POST, produces = "application/json")
    public LotteryTicket addTicket(@RequestBody LotteryTicket lotteryTicket) {
        lotteryGameService.addTicket(lotteryTicket);
        return lotteryTicket;
    }

    @RequestMapping(path = "/admin", method = RequestMethod.GET, produces = "application/json")
    public WinnerTicketsDto getTheWinners(@RequestBody LotteryTicket winnerTicket) {
        return lotteryGameService.checkTheTickets(winnerTicket);
    }

}
