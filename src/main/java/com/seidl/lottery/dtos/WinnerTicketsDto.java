/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seidl.lottery.dtos;

import com.seidl.lottery.model.LotteryTicket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Áron
 */
public class WinnerTicketsDto {

    private List<LotteryTicket> fiveHits = new ArrayList<>();
    private List<LotteryTicket> fourHits = new ArrayList<>();
    private List<LotteryTicket> threeHits = new ArrayList<>();
    private List<LotteryTicket> twoHits = new ArrayList<>();

    public List<LotteryTicket> getFiveHits() {
        return fiveHits;
    }

    public void setFiveHits(List<LotteryTicket> fiveHits) {
        this.fiveHits = fiveHits;
    }

    public List<LotteryTicket> getFourHits() {
        return fourHits;
    }

    public void setFourHits(List<LotteryTicket> fourHits) {
        this.fourHits = fourHits;
    }

    public List<LotteryTicket> getThreeHits() {
        return threeHits;
    }

    public void setThreeHits(List<LotteryTicket> threeHits) {
        this.threeHits = threeHits;
    }

    public List<LotteryTicket> getTwoHits() {
        return twoHits;
    }

    public void setTwoHits(List<LotteryTicket> twoHits) {
        this.twoHits = twoHits;
    }

}
