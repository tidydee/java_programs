package com.dspamer;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "No Plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "When aliens decide to visit earth.";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe.";
    }
}

class ForgetableMovie extends Movie {
    public ForgetableMovie() {
        super("Forgetable Movie");
    }

    // No plot method!
}

public class Main {

    public static void main(String[] args) {
	    for (int i=1; i<11; i++) {
	        Movie movie = randomMovie();
            System.out.println("Moive # " + i +
                            " : " + movie.getName() + "\n" +
                            "Plot: " + movie.plot() + "\n");
        }
    }


    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new MazeRunner();
            case 3:
                return new StarWars();
            case 4:
                return new ForgetableMovie();
            case 5:
                return  new IndependenceDay();
            default:
                return null;
        }
    }
}
