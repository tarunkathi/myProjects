import java.util.Scanner; 

class stringNumbers{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] inputs = new String [n];    
        for(int i=0;i<n;i++){
            System.out.println(i);
            inputs[i] = sc.nextLine();
            //sc.nextLine();
        }
        
        //String inputs [] = inp.split("\n");
        sc.close();
        String output = "";
        for(int i=0;i<n;i++) {
            String []  data = inputs[i].split(" ");
            output += ((data[0].length()>15)?data[0].substring(0, 14):data[0]);
            output += " "+String.format("%03d", Integer.parseInt(data[1]));
            output+= "\n";
        }
        System.out.println(output);
            
        }
    }
