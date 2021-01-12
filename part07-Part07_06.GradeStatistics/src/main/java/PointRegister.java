
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrewvijay
 */
public class PointRegister {
    
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    //private Grades grades;

    public PointRegister() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public void addPoint(int point) {
        if(point >= 0 && point <= 100) {
            this.points.add(point);
            //this.grades.add(point);
        }
    }
    
    public int getSumOfPoints() {
        int sumOfPoints = 0;
        for(int point: this.points) {
            sumOfPoints += point;
        }
        return sumOfPoints;
    }
    
    public int noOfPoints() {
        return this.points.size();
    }
    
    public double averageOfPoints() {
        return (double) this.getSumOfPoints() / this.noOfPoints();
    }
    
    public int getSumOfPassingPoints() {
        int sumOfPassingPoints = 0;
        for(int point: this.points) {
            if(point >= 50) {
                sumOfPassingPoints += point;
            }
        }
        return sumOfPassingPoints;
    }
    
    public int noOfPassingPoints() {
        int noOfPassingPoints = 0;
        for(int point: this.points) {
            if(point >= 50) {
                noOfPassingPoints++;
            }
        }
        return noOfPassingPoints;
    }
    
    public String averageOfPassingPoints() {
        if(this.noOfPassingPoints() == 0) {
            return "-";
        }
        double average = (double) this.getSumOfPassingPoints() / this.noOfPassingPoints();
        String averageString = String.valueOf(average);
        return averageString;
    }
    
    public double passPercentage() {
        double passPercentage = (double) this.noOfPassingPoints() / this.noOfPoints();
        return 100*passPercentage;
    }
    
    public void pointsToGrade() {
        for(int point: this.points) {
            if(point < 50) {
                this.grades.add(0);
                continue;
            }
            if(point < 60) {
                this.grades.add(1);
                continue;
            }
            if(point < 70) {
                this.grades.add(2);
                continue;
            }
            if(point < 80) {
                this.grades.add(3);
                continue;
            }
            if(point < 90) {
                this.grades.add(4);
                continue;
            }
            this.grades.add(5);
        }
    }
    
    public int noOfGrades(int givenGrade) {
        int noOfGrades = 0;
        for(int grade: this.grades) {
            if(grade == givenGrade) {
                noOfGrades++;
            }
        }
        return noOfGrades;
    }
    
    public void printStars(int noOfGrades) {
        for(int i = 0; i < noOfGrades; i++) {
            System.out.print("*");
        }
    }
    
    public void printGradeDistribution() {
        this.pointsToGrade();
        int grade = 5;
        while(grade >= 0) {
            int noOfGrades = this.noOfGrades(grade);
            System.out.print(grade+": ");
            this.printStars(noOfGrades);
            grade--;
            System.out.println("");
        }
    }
}
