{
    private Scanner input;
    private QuestionGenerator generator;
    private String selection;
    private String answerChoice;

    public ChoiceGenerator(){
        generator = new QuestionGenerator();
        input = new Scanner(System.in);
        answerChoice = "";
    }

    public String getQuestions(){

        System.out.println("Here are your selections:\n1. Grade 1: Subtracting Numbers By one\n2. Grade 1: Adding Numbers by 4\n3. " +
                "Grade 2: Subtracting Numbers that are Multiples of Ten\n4. Grade 2: Adding 3-Digit Numbers\n5. Grade 3: Mixed Operation Equations\n" +
                "6. Grade 3: Dividing Numbers By 3\n7. Grade 4: Adding Numbers 4 Digit Numbers\n8. Grade 4: Finding Two Numbers with their Sum and Difference\n" +
                "9.Grade 5: Adding 7 - Digit Numbers\n10. Grade 5: Multiplying 3 - Digit Numbers by 1 digit Numbers ");
        selection = input.nextLine();

        if(selection.equals(""+ 1)){ return generator.subtractByOne();}

        else if (selection.equals(""+ 2)){ return generator.addByFour();}

        else if (selection.equals(""+ 3)){ return generator.subtractByMultiplesOfTen();}

        else if(selection.equals(""+ 4)){ return generator.addThreeNums();}

        else if (selection.equals(""+ 5)){ return generator.doMixedOperations();}

        else if (selection.equals(""+ 6)){ return generator.divideByThree();}

        else if(selection.equals(""+ 7)){ return generator.addThousands();}

        else if (selection.equals(""+ 8)){ return generator.findTwoNums();}

        else if (selection.equals(""+ 9)){ return generator.addNumMillions();}

        else if (selection.equals(""+ 10)){ return generator.multiplyNums();}

       else { System.out.println("Invalid Option, you need to pay attention to directions"); 

        return getQuestions();
        }

    }

    public void repeatQuestions(){


        if(selection.equals(""+ 1)) {
            while (!answerChoice.equals("end")) {
                generator.subtractByOne();
                answerChoice = generator.getValueOfAnswer();
            }
        }
        else if (selection.equals(""+ 2)) {
            while (!answerChoice.equals("end")) {
                generator.addByFour();
                answerChoice = generator.getValueOfAnswer();
            }
        }
        else if (selection.equals(""+ 3)) {
            while (!answerChoice.equals("end")) {
                generator.subtractByMultiplesOfTen();
                answerChoice = generator.getValueOfAnswer();
            }
        }
        else if(selection.equals(""+ 4)) {
            while (!answerChoice.equals("end")) {
                generator.addThreeNums();
                answerChoice = generator.getValueOfAnswer();
            }
        }
        else if (selection.equals(""+ 5)) {
            while (!answerChoice.equals("end")) {
                generator.doMixedOperations();
                answerChoice = generator.getValueOfAnswer();
            }
        }
        else if (selection.equals(""+ 6)) {
            while (!answerChoice.equals("end")) {
                generator.divideByThree();
                answerChoice = generator.getValueOfAnswer();
            }
        }
        else if(selection.equals(""+ 7)) {
            while (!answerChoice.equals("end")) {
                generator.addThousands();
                answerChoice = generator.getValueOfAnswer();
            }
        }
        else if (selection.equals(""+ 8)) {
            while (!answerChoice.equals("end")) {
                generator.findTwoNums();
                answerChoice = generator.getValueOfAnswer();
            }
        }

        else if (selection.equals(""+ 9)) {
            while (!answerChoice.equals("end")) {
                generator.addNumMillions();
                answerChoice = generator.getValueOfAnswer();
            }
        }
        else if (selection.equals(""+ 10)) {
            while (!answerChoice.equals("end")) {
                generator.multiplyNums();
                answerChoice = generator.getValueOfAnswer();
            }
        }
        else {
            System.out.println("Invalid Option, you need to pay attention to directions");
        }

    }

    
    }

}
