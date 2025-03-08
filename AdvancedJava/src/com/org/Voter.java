package com.org;

class Voter {

    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws VoterAgeNotWithinRangeException {
        if (age < 18) {
            throw new VoterAgeNotWithinRangeException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
}

