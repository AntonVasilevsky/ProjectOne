package com.moretasks;

public class Runner {
    private String name;
    private int id;
    private int time;

    public Runner(String name, int id, int time) {
        this.name = name;
        this.id = id;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", time=" + time +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getTime() {
        return time;
    }
}
