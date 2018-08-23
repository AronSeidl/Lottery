/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seidl.lottery.model;

import java.io.Serializable;
import java.util.Arrays;
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

    private static final int PRICE = 1000;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String name;

    private int first;
    private int second;
    private int third;
    private int fourth;
    private int fifth;

    public LotteryTicket() {
    }

    public LotteryTicket(String name, int first, int second, int third, int fourth, int fifth) {
        this.name = name;
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
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

    public void setName(String name) {
        this.name = name;
    }

    public static int getPrice() {
        return PRICE;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getThird() {
        return third;
    }

    public void setThird(int third) {
        this.third = third;
    }

    public int getFourth() {
        return fourth;
    }

    public void setFourth(int fourth) {
        this.fourth = fourth;
    }

    public int getFifth() {
        return fifth;
    }

    public void setFifth(int fifth) {
        this.fifth = fifth;
    }

    public List<Integer> getPlayedNumbers() {
        return Arrays.asList(first, second, third, fourth, fifth);
    }

}
