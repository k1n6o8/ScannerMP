import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String input = "";
        String output= "";
        char currChar;
        State currState;
        try{	
           FileReader fileread = new FileReader("input.txt");
           BufferedReader br = new BufferedReader(fileread);		

	   String contentLine = br.readLine();
	   while (contentLine != null) {
	      input = input+contentLine+'\n';
	      contentLine = br.readLine();
       }
       br.close();
        }
        catch (IOException ioe) 
        {
	   ioe.printStackTrace();
        } 
        String[] inputTokens = input.split(" ");
            //initialize states
            State q0 = new State();
            q0.finalState = false;
            q0.tokenlabel = null;
            State q1 = new State();
            q1.finalState = false;
            q1.tokenlabel = null;
            State q2 = new State();
            q2.finalState = false;
            q2.tokenlabel = null;
            State q3 = new State();
            q3.finalState = false;
            q3.tokenlabel = null;
            State q4 = new State();
            q4.finalState = false;
            q4.tokenlabel = null;
            State q5 = new State();
            q5.finalState = false;
            q5.tokenlabel = null;
            State q6 = new State();
            q6.finalState = true;
            q6.tokenlabel = "KEYWORD";
            State q7 = new State();
            q7.finalState = false;
            q7.tokenlabel = null;
            State q8 = new State();
            q8.finalState = false;
            q8.tokenlabel = null;
            State q9 = new State();
            q9.finalState = false;
            q9.tokenlabel = null;
            State q10 = new State();
            q10.finalState = true;
            q10.tokenlabel = "KEYWORD";
            State q11 = new State();
            q11.finalState = true;
            q11.tokenlabel = "KEYWORD";
            State q12 = new State();
            q12.finalState = false;
            q12.tokenlabel = null;
            State q13 = new State();
            q13.finalState = false;
            q13.tokenlabel = null;
            State q14 = new State();
            q14.finalState = false;
            q14.tokenlabel = null;
            State q15 = new State();
            q15.finalState = true;
            q15.tokenlabel = "GPR";
            State q16 = new State();
            q16.finalState = true;
            q16.tokenlabel = "GPR";
            State q17 = new State();
            q17.finalState = true;
            q17.tokenlabel = "GPR";
            State q18 = new State();
            q18.finalState = true;
            q18.tokenlabel = "GPR";
            State q19 = new State();
            q19.finalState = true;
            q19.tokenlabel = "GPR";
            State q20 = new State();
            q20.finalState = true;
            q20.tokenlabel = "FPR";
            State q21 = new State();
            q21.finalState = true;
            q21.tokenlabel = "FPR";
            State q22 = new State();
            q22.finalState = true;
            q22.tokenlabel = "FPR";
            State q23 = new State();
            q23.finalState = true;
            q23.tokenlabel = "FPR";
            State q24 = new State();
            q24.finalState = true;
            q24.tokenlabel = "FPR";
            State deadState = new State();
            deadState.tokenlabel = "ERROR";
  
            currState = q0;
            for (int i = 0; i < inputTokens.length; i++){
                for (int j = 0; j < inputTokens[i].length(); j++){
                        currChar = inputTokens[i].charAt(j);
                        if (currChar != '\n' && currChar != ','){
                            if(currState == q0){
                                if(currChar == 'D')
                                    currState = q1;
                                else if(currChar == 'R')
                                    currState = q12;
                                else if (currChar == '$')
                                    currState = q13;
                                else if (currChar == 'F')
                                    currState = q14;
                                else
                                    currState = deadState;
                                }
                            else if (currState == q1){
                                if(currChar == 'A')
                                    currState = q2;
                                else if (currChar == 'M')
                                    currState = q3;
                                else
                                    currState = deadState;
                                }
                            else if (currState == q2){
                                if(currChar == 'D')
                                    currState = q4;
                                else
                                    currState = deadState;
                            }
                            else if (currState == q3){
                                if(currChar == 'U')
                                    currState = q8;
                                else
                                    currState = deadState;
                            }
                            else if (currState == q4){
                                if(currChar == 'D')
                                    currState = q5;
                                else
                                    currState = deadState;
                            }
                            else if (currState == q5){
                                if(currChar == 'U')
                                    currState = q6 ;
                                else if (currChar == 'I')
                                    currState = q7;
                                else
                                    currState = deadState;
                            }
                            else if (currState == q6){
                                currState = deadState;
                            }
                            else if (currState == q7){
                                if(currChar == 'U')
                                    currState = q6;
                                else
                                    currState = deadState;
                            }
                            else if (currState == q8){
                                if(currChar == 'L')
                                    currState = q9;
                                else
                                    currState = deadState;
                            }
                            else if (currState == q9){
                                if(currChar == 'T')
                                    currState = q10;
                                else
                                    currState = deadState;
                            }
                            else if (currState == q10){
                                if(currChar == 'U')
                                    currState = q11;
                                else
                                    currState = deadState;
                            }
                            else if (currState == q11){
                                    currState = deadState;
                            }
                            else if (currState == q12){
                                if(currChar == '0' || currChar =='4' || currChar =='5' || currChar =='6' || currChar =='7' || currChar =='8' || currChar =='9') 
                                    currState = q15;
                                else if (currChar =='1' || currChar =='2') 
                                    currState = q16;
                                else if (currChar =='3')
                                    currState = q17;
                                else 
                                    currState = deadState;
                            }
                            else if (currState == q13){
                                if(currChar == '0' || currChar =='4' || currChar =='5' || currChar =='6' || currChar =='7' || currChar =='8' || currChar =='9') 
                                    currState = q15;
                                else if (currChar =='1' || currChar =='2') 
                                    currState = q16;
                                else if (currChar =='3')
                                    currState = q17;
                                else if (currChar == 'F')
                                    currState = q14;
                                else 
                                    currState = deadState;
                            }
                            else if (currState == q14){
                                if(currChar == '0' || currChar =='4' || currChar =='5' || currChar =='6' || currChar =='7' || currChar =='8' || currChar =='9') 
                                    currState = q20;
                                else if (currChar =='1' || currChar =='2') 
                                    currState = q21;
                                else if (currChar =='3')
                                    currState = q22;
                                else 
                                    currState = deadState;
                            }
                            else if (currState == q15){
                                    currState = deadState;
                            }
                            else if (currState == q16){
                                if(currChar == '0' || currChar =='1'|| currChar =='2'|| currChar =='3' || currChar =='4' || currChar =='5' || currChar =='6' || currChar =='7' || currChar =='8' || currChar =='9')
                                    currState = q18;
                                else 
                                     currState = deadState;
                            }
                            else if (currState == q17){
                                if(currChar == '0' || currChar =='1')
                                     currState = q18;
                                 else 
                                     currState = deadState;                                
                            }
                            else if (currState == q18){
                                    currState = deadState;
                            }
                            else if (currState == q19){
                                    currState = deadState;
                            }
                            else if (currState == q20){
                                    currState = deadState;
                            }
                            else if (currState == q21){
                                if(currChar == '0' || currChar =='1'|| currChar =='2'|| currChar =='3' || currChar =='4' || currChar =='5' || currChar =='6' || currChar =='7' || currChar =='8' || currChar =='9')
                                    currState = q23;
                                else 
                                     currState = deadState;
                            }
                            else if (currState == q22){
                                if(currChar == '0' || currChar =='1')
                                     currState = q24;
                                 else 
                                     currState = deadState;                                
                            }
                            else if (currState == q23){
                                    currState = deadState;
                            }
                            else if (currState == q24){
                                    currState = deadState;
                            }
                        }
                   
                            if (currChar == ',' || j == inputTokens[i].length()-1){
                                if(currState.tokenlabel != null)
                                    output+= currState.tokenlabel;
                                else if (currState.tokenlabel == null && currState != q0)
                                    output+= "ERROR";
                                output+= ' ';
                                currState = q0;
                            }
                            else if (currChar == '\n'){
                                if(currState.tokenlabel != null)
                                    output+= currState.tokenlabel;
                                else if (currState.tokenlabel == null && currState != q0)
                                    output+= "ERROR";
                                output+= '\n';
                                currState = q0;
                            }
                        
                        }    
            
            }
        try {
        FileWriter file = new FileWriter("output.txt");
        BufferedWriter bw = new BufferedWriter(file);
        bw.write(output);
        bw.close();
        }

        catch (Exception e) {
          e.getStackTrace();
        }
        }
    }

class State{
    boolean finalState;
    String tokenlabel;
}



