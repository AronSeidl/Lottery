/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seidl.lottery.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author Áron
 */
@Entity
public class LotteryTicket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private static final int PRICE = 1000;
    @NotEmpty
    private String name;
    @NotEmpty
    private final List<Integer> playedNumbers = new ArrayList<>();

    public LotteryTicket(String name, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        this.name = name;
        playedNumbers.add(firstNumber);
        playedNumbers.add(secondNumber);
        playedNumbers.add(thirdNumber);
        playedNumbers.add(fourthNumber);
        playedNumbers.add(fifthNumber);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getPlayedNumbers() {
        return playedNumbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getPRICE() {
        return PRICE;
    }

}
