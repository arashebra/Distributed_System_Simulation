/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raymondAlgorithm;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;

public class DsSimProject extends Thread {

    static MyDs myDs;
    double[] xData = new double[5];
    double[] yData = new double[] { 2.0, 4.0, 6.0, 8.0, 10.0 };
    long sum = 0;

    int div;

    
    @Override
    public void run() {
        try {
            div = 1;
            System.out.println("####################################################################");
            System.out.println("####################################################################");
            System.out.println("########################### TEST ###################################");
            System.out.println("####################################################################");
            System.out.println("####################################################################");

            myDs = new MyDs();
            myDs.n = 2;
            myDs.setStructure();

            for (int i = 0; i < 2; i++) {
                try {
                    myDs.myNodes[i].wantCs();
                } catch (Exception e) {
                }

            }

            sleep(30000);
            System.out.println("\n\n\n\n\n\n\n\n\n");

            for (int i = 1; i <= 2; i++) {
                try {
                    System.out.println(myDs.myNodes[i-1].getStartRequestCSTime()+" زمان تقاضا نود  ======>  "+myDs.myNodes[i-1].getName());
                    System.out.println(myDs.myNodes[i-1].getStartCatchCSTime()+" زمان دریافت  نود ======>  "+myDs.myNodes[i-1].getName());
                    if( myDs.myNodes[i-1].getStartCatchCSTime() != null && myDs.myNodes[i-1].getStartRequestCSTime() != null ){
                        div++;
                        sum+= myDs.myNodes[i-1].getStartCatchCSTime() - myDs.myNodes[i-1].getStartRequestCSTime();
                    }
                    if(!myDs.myNodes[i-1].getNodeMemory().getMemory().isEmpty()){
                        for (Iterator iterator = myDs.myNodes[i-1].getNodeMemory().getMemory().iterator(); iterator.hasNext();) {
                            System.out.println( ((MyNode)iterator.next()).getName()+" حافظه نود  ======>  "+myDs.myNodes[i-1].getName());

                        }
                    }
                } catch (Exception e) {
                }

            }

            System.out.println("\n\n\n");
            System.out.println(" sum =====> " + sum);
            xData[0] = (double)sum/div;
            System.out.println(" D"+0+" =====> " + xData[0]);
            System.out.println(" div"+0+" =====> " + div);



            System.out.println("\n\n");
            System.out.println( myDs.root2(myDs).getName() +" ریشه درخت ======>  ");
            
            
            
            div = 1;
            System.out.println("####################################################################");
            System.out.println("####################################################################");
            System.out.println("########################### TEST ###################################");
            System.out.println("####################################################################");
            System.out.println("####################################################################");

            myDs = new MyDs();
            myDs.n = 4;
            myDs.setStructure();

            for (int i = 0; i < 4; i++) {
                try {
                    myDs.myNodes[i].wantCs();
                } catch (Exception e) {
                }

            }

            sleep(30000);
            System.out.println("\n\n\n\n\n\n\n\n\n");

            for (int i = 1; i <= 4; i++) {
                try {
                    System.out.println(myDs.myNodes[i-1].getStartRequestCSTime()+" زمان تقاضا نود  ======>  "+myDs.myNodes[i-1].getName());
                    System.out.println(myDs.myNodes[i-1].getStartCatchCSTime()+" زمان دریافت  نود ======>  "+myDs.myNodes[i-1].getName());
                    if( myDs.myNodes[i-1].getStartCatchCSTime() != null && myDs.myNodes[i-1].getStartRequestCSTime() != null ){
                        div++;
                        sum+= myDs.myNodes[i-1].getStartCatchCSTime() - myDs.myNodes[i-1].getStartRequestCSTime();
                    }
                    if(!myDs.myNodes[i-1].getNodeMemory().getMemory().isEmpty()){
                        for (Iterator iterator = myDs.myNodes[i-1].getNodeMemory().getMemory().iterator(); iterator.hasNext();) {
                            System.out.println( ((MyNode)iterator.next()).getName()+" حافظه نود  ======>  "+myDs.myNodes[i-1].getName());

                        }
                    }
                } catch (Exception e) {
                }

            }

            System.out.println("\n\n\n");
            System.out.println(" sum =====> " + sum);
            xData[1] = (double)sum/div;
            System.out.println(" D"+1+" =====> " + xData[1]);
            System.out.println(" dive"+1+" =====> " + div);



            System.out.println("\n\n");
            System.out.println( myDs.root2(myDs).getName() +" ریشه درخت ======>  ");
            
            
            div = 1;
            System.out.println("####################################################################");
            System.out.println("####################################################################");
            System.out.println("########################### TEST ###################################");
            System.out.println("####################################################################");
            System.out.println("####################################################################");

            myDs = new MyDs();
            myDs.n = 6;
            myDs.setStructure();

            for (int i = 0; i < 6; i++) {
                try {
                    myDs.myNodes[i].wantCs();
                } catch (Exception e) {
                }

            }

            sleep(30000);
            System.out.println("\n\n\n\n\n\n\n\n\n");

            for (int i = 1; i <= 6; i++) {
                try {
                    System.out.println(myDs.myNodes[i-1].getStartRequestCSTime()+" زمان تقاضا نود  ======>  "+myDs.myNodes[i-1].getName());
                    System.out.println(myDs.myNodes[i-1].getStartCatchCSTime()+" زمان دریافت  نود ======>  "+myDs.myNodes[i-1].getName());
                    if( myDs.myNodes[i-1].getStartCatchCSTime() != null && myDs.myNodes[i-1].getStartRequestCSTime() != null ){
                        div++;
                        sum+= myDs.myNodes[i-1].getStartCatchCSTime() - myDs.myNodes[i-1].getStartRequestCSTime();
                    }
                    if(!myDs.myNodes[i-1].getNodeMemory().getMemory().isEmpty()){
                        for (Iterator iterator = myDs.myNodes[i-1].getNodeMemory().getMemory().iterator(); iterator.hasNext();) {
                            System.out.println( ((MyNode)iterator.next()).getName()+" حافظه نود  ======>  "+myDs.myNodes[i-1].getName());

                        }
                    }
                } catch (Exception e) {
                }

            }

            System.out.println("\n\n\n");
            System.out.println(" sum =====> " + sum);
            xData[2] = (double)sum/div;
            System.out.println(" D"+2+" =====> " + xData[2]);
            System.out.println(" div"+2+" =====> " + div);


            System.out.println("\n\n");
            System.out.println( myDs.root2(myDs).getName() +" ریشه درخت ======>  ");
            
            
            div = 1;            
            System.out.println("####################################################################");
            System.out.println("####################################################################");
            System.out.println("########################### TEST ###################################");
            System.out.println("####################################################################");
            System.out.println("####################################################################");

            myDs = new MyDs();
            myDs.n = 8;
            myDs.setStructure();

            for (int i = 0; i < 8; i++) {
                try {
                    myDs.myNodes[i].wantCs();
                } catch (Exception e) {
                }

            }

            sleep(30000);
            System.out.println("\n\n\n\n\n\n\n\n\n");

            for (int i = 1; i <= 8; i++) {
                try {
                    System.out.println(myDs.myNodes[i-1].getStartRequestCSTime()+" زمان تقاضا نود  ======>  "+myDs.myNodes[i-1].getName());
                    System.out.println(myDs.myNodes[i-1].getStartCatchCSTime()+" زمان دریافت  نود ======>  "+myDs.myNodes[i-1].getName());
                    if( myDs.myNodes[i-1].getStartCatchCSTime() != null && myDs.myNodes[i-1].getStartRequestCSTime() != null ){
                        div++;
                        sum+= myDs.myNodes[i-1].getStartCatchCSTime() - myDs.myNodes[i-1].getStartRequestCSTime();
                    }
                    if(!myDs.myNodes[i-1].getNodeMemory().getMemory().isEmpty()){
                        for (Iterator iterator = myDs.myNodes[i-1].getNodeMemory().getMemory().iterator(); iterator.hasNext();) {
                            System.out.println( ((MyNode)iterator.next()).getName()+" حافظه نود  ======>  "+myDs.myNodes[i-1].getName());

                        }
                    }
                } catch (Exception e) {
                }

            }

            System.out.println("\n\n\n");
            System.out.println(" sum =====> " + sum);
            xData[3] = (double)sum/div;
            System.out.println(" div"+3+" =====> " + div);



            System.out.println("\n\n");
            System.out.println( myDs.root2(myDs).getName() +" ریشه درخت ======>  ");
            
            
            
            div = 1;            
            System.out.println("####################################################################");
            System.out.println("####################################################################");
            System.out.println("########################### TEST ###################################");
            System.out.println("####################################################################");
            System.out.println("####################################################################");

            myDs = new MyDs();
            myDs.n = 10;
            myDs.setStructure();

            for (int i = 0; i < 10; i++) {
                try {
                    myDs.myNodes[i].wantCs();
                } catch (Exception e) {
                }

            }

            sleep(30000);
            System.out.println("\n\n\n\n\n\n\n\n\n");

            for (int i = 1; i <= 10; i++) {
                try {
                    System.out.println(myDs.myNodes[i-1].getStartRequestCSTime()+" زمان تقاضا نود  ======>  "+myDs.myNodes[i-1].getName());
                    System.out.println(myDs.myNodes[i-1].getStartCatchCSTime()+" زمان دریافت  نود ======>  "+myDs.myNodes[i-1].getName());
                    if( myDs.myNodes[i-1].getStartCatchCSTime() != null && myDs.myNodes[i-1].getStartRequestCSTime() != null ){
                        div++;
                        sum+= myDs.myNodes[i-1].getStartCatchCSTime() - myDs.myNodes[i-1].getStartRequestCSTime();
                    }
                    if(!myDs.myNodes[i-1].getNodeMemory().getMemory().isEmpty()){
                        for (Iterator iterator = myDs.myNodes[i-1].getNodeMemory().getMemory().iterator(); iterator.hasNext();) {
                            System.out.println( ((MyNode)iterator.next()).getName()+" حافظه نود  ======>  "+myDs.myNodes[i-1].getName());

                        }
                    }
                } catch (Exception e) {
                }

            }

            System.out.println("\n\n\n");
            System.out.println(" sum =====> " + sum);
            xData[4] = (double)sum/div;
            System.out.println(" D"+4+" =====> " + xData[4]);
            System.out.println(" div"+4+" =====> " + div);



            System.out.println("\n\n");
            System.out.println( myDs.root2(myDs).getName() +" ریشه درخت ======>  ");
            
            
            sleep(5000);
            System.out.println(Arrays.toString(xData));
            
            
            org.knowm.xchart.XYChart chart = QuickChart.getChart("Sample Chart", "X", "Y", "y(x)", yData, xData);
        
            new SwingWrapper(chart).displayChart();

            BitmapEncoder.saveBitmap(chart, "./Sample_Chart", BitmapEncoder.BitmapFormat.PNG);
            
            

        } catch (InterruptedException ex) {
            Logger.getLogger(DsSimProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DsSimProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
    }
    
    
    
    
    public static void main(String[] args) {
        

        DsSimProject t1 = new DsSimProject();
        t1.start();

        //printInfo(myDs);


    }
    
    private static void test(int n)
    {
        myDs = new MyDs();
        myDs.n = n;
        myDs.setStructure();

        for (int i = 0; i < n; i++) {
            try {
                myDs.myNodes[i].wantCs();
            } catch (Exception e) {
            }
            
        }
    }
    
    
    private static void printInfo(MyDs myDs )
    {
                
        System.out.println("Root Node Name => " + myDs.root2(myDs).getName());
        for (Iterator iterator = myDs.root2(myDs).getNodeMemory().getMemory().iterator(); iterator.hasNext();) {
            System.out.println( "Root Node Memory => " + ((MyNode)iterator.next()).getName() );
            
        }
        System.out.println("------------------------\n");
        System.out.println("------------------------\n");
        for (Iterator iterator = myDs.myNodes[1-1].getNodeMemory().getMemory().iterator(); iterator.hasNext();) {
            System.out.println( "node1 Memory => " + ((MyNode)iterator.next()).getName() );
            
        }
        System.out.println("------------------------\n");
        for (Iterator iterator = myDs.myNodes[2-1].getNodeMemory().getMemory().iterator(); iterator.hasNext();) {
            System.out.println( "node2 Memory => " + ((MyNode)iterator.next()).getName() );
            
        }
        System.out.println("------------------------\n");
        for (Iterator iterator = myDs.myNodes[3-1].getNodeMemory().getMemory().iterator(); iterator.hasNext();) {
            System.out.println( "node3 Memory => " + ((MyNode)iterator.next()).getName() );
            
        }
        System.out.println("------------------------\n");
        for (Iterator iterator = myDs.myNodes[4-1].getNodeMemory().getMemory().iterator(); iterator.hasNext();) {
            System.out.println( "node4 Memory => " + ((MyNode)iterator.next()).getName() );
            
        }
        System.out.println("------------------------\n");
        for (Iterator iterator = myDs.myNodes[5-1].getNodeMemory().getMemory().iterator(); iterator.hasNext();) {
            System.out.println( "node5 Memory => " + ((MyNode)iterator.next()).getName() );
            
        }
        System.out.println("------------------------\n");
        for (Iterator iterator = myDs.myNodes[6-1].getNodeMemory().getMemory().iterator(); iterator.hasNext();) {
            System.out.println( "node6 Memory => " + ((MyNode)iterator.next()).getName() );
            
        }
        System.out.println("------------------------\n");
        System.out.println("================================================\n\n\n\n");
    }
 
}
