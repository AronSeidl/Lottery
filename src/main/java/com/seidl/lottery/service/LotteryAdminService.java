/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seidl.lottery.service;

import com.seidl.lottery.model.LotteryTicket;
import org.springframework.stereotype.Component;

/**
 *
 * @author Áron
 */
@Component
public class LotteryAdminService {

    public LotteryTicket createWinnerTicket() {

        int firstWinnerNumber = (int) Math.floor(Math.random() * 90) + 1;
        int secondWinnerNumber = (int) Math.floor(Math.random() * 90) + 1;
        int thirdWinnerNumber = (int) Math.floor(Math.random() * 90) + 1;
        int fourthWinnerNumber = (int) Math.floor(Math.random() * 90) + 1;
        int fifthWinnerNumber = (int) Math.floor(Math.random() * 90) + 1;

        return new LotteryTicket("winner", firstWinnerNumber, secondWinnerNumber, thirdWinnerNumber, fourthWinnerNumber, fifthWinnerNumber);
    }

}
