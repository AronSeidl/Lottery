/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seidl.lottery.service;

import com.seidl.lottery.dtos.WinnerTicketsDto;
import com.seidl.lottery.model.LotteryTicket;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;

/**
 *
 * @author Áron
 */
@Component
public class LotteryGameService {

    @PersistenceContext
    EntityManager em;

    private final static List<LotteryTicket> playingTickets = new ArrayList<>();

    private List<LotteryTicket> fiveHits = new ArrayList<>();
    private List<LotteryTicket> fourHits = new ArrayList<>();
    private List<LotteryTicket> threeHits = new ArrayList<>();
    private List<LotteryTicket> twoHits = new ArrayList<>();

    @Transactional
    public void addTicket(LotteryTicket lotteryTicket) {

        em.persist(lotteryTicket);

    }

    public WinnerTicketsDto checkTheTickets(LotteryTicket winnerTicket) {
        WinnerTicketsDto winnerTicketsDto = null;
        int combo;
        for (LotteryTicket playingTicket : playingTickets) {
            combo = 0;
            for (int i = 0; i < 5; i++) {
                if (winnerTicket.getPlayedNumbers().contains(playingTicket.getPlayedNumbers().get(i))) {
                    combo++;
                }
            }
            switch (combo) {
                case 2:
                    twoHits.add(playingTicket);
                    break;
                case 3:
                    threeHits.add(playingTicket);
                    break;
                case 4:
                    fourHits.add(playingTicket);
                    break;
                case 5:
                    fiveHits.add(playingTicket);
                    break;
            }
        }
        winnerTicketsDto.setTwoHits(twoHits);
        winnerTicketsDto.setThreeHits(threeHits);
        winnerTicketsDto.setFourHits(fourHits);
        winnerTicketsDto.setFiveHits(fiveHits);
        return winnerTicketsDto;
    }

    public void clearTicketList() {
        playingTickets.clear();
    }

    public static List<LotteryTicket> getPlayingTickets() {
        return playingTickets;
    }

    public List<LotteryTicket> getFiveHits() {
        return fiveHits;
    }

    public List<LotteryTicket> getFourHits() {
        return fourHits;
    }

    public List<LotteryTicket> getThreeHits() {
        return threeHits;
    }

    public List<LotteryTicket> getTwoHits() {
        return twoHits;
    }

}
