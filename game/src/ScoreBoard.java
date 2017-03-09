
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;


public class ScoreBoard extends javax.swing.JFrame {
    //private int Np, Wp , Ep , Up;
    public boolean wakeUp = false; 
    private ArrayList < String > userlist , eastlist , northlist , westlist;
    public ScoreBoard() {
        initComponents(); 
        setResizable (false);
        setDefaultCloseOperation (JFrame.DO_NOTHING_ON_CLOSE);
        userlist = new ArrayList < String > (); 
        eastlist = new ArrayList < String > (); 
        northlist = new ArrayList < String > (); 
        westlist = new ArrayList < String > ();
        TotalPointOfEast = 0; 
        TotalPointOfWest = 0; 
        TotalPointOfUser = 0; 
        TotalPointOfNorth = 0;
    }
    private final int GamePoint = 500;
    private int TotalPointOfUser;
    private int TotalPointOfEast;
    private int TotalPointOfWest; 
    private int TotalPointOfNorth; 
    public void ShowOnList (int Up, int Ep , int Np , int Wp) {
        
        userlist.add(String.valueOf(Up)); 
        eastlist.add(String.valueOf(Ep)); 
        northlist.add(String.valueOf(Np));
        westlist.add(String.valueOf(Wp));
        TotalPointOfWest += Wp;
        TotalPointOfUser += Up; 
        TotalPointOfNorth += Np; 
        TotalPointOfEast += Ep;
        yourList.setModel(new ListModel () {

            @Override
            public int getSize() {
                return userlist.size();
            }

            @Override
            public Object getElementAt(int index) {
                return userlist.get(index); 
            }

            @Override
            public void addListDataListener(ListDataListener l) {}

            @Override
            public void removeListDataListener(ListDataListener l) {}
        
        });
        
        eastList.setModel(new ListModel () {

            @Override
            public int getSize() {
                return eastlist.size();
            }

            @Override
            public Object getElementAt(int index) {
                return eastlist.get(index); 
            }

            @Override
            public void addListDataListener(ListDataListener l) {}

            @Override
            public void removeListDataListener(ListDataListener l) {}
        
        });
        
        northList.setModel(new ListModel () {

            @Override
            public int getSize() {
                return northlist.size();
            }

            @Override
            public Object getElementAt(int index) {
                return northlist.get(index); 
            }

            @Override
            public void addListDataListener(ListDataListener l) {}

            @Override
            public void removeListDataListener(ListDataListener l) {}
        
        });
        
        westList.setModel(new ListModel () {

            @Override
            public int getSize() {
                return westlist.size();
            }

            @Override
            public Object getElementAt(int index) {
                return westlist.get(index); 
            }

            @Override
            public void addListDataListener(ListDataListener l) {}

            @Override
            public void removeListDataListener(ListDataListener l) {}
        
        });
        if (TotalPointOfEast >= GamePoint || TotalPointOfWest >= GamePoint || TotalPointOfUser >= GamePoint || TotalPointOfNorth >= GamePoint)
        {
            int arr [] = new int [4]; 
            arr[0] = TotalPointOfWest; 
            arr[1] = TotalPointOfUser; 
            arr[2] = TotalPointOfNorth; 
            arr[3] = TotalPointOfEast;
            HashMap < Integer , String > map = new HashMap <Integer , String > ();
            map.put(arr[0], "West"); 
            map.put(arr[1], "User"); 
            map.put(arr[2], "North"); 
            map.put(arr[3], "East");
            Arrays.sort(arr, 0 , 4);
            String winer = map.get(arr[3]);
            new WiningAnnouncement (winer);
            return ;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WestScore = new javax.swing.JLabel();
        userScore = new javax.swing.JLabel();
        EastScore = new javax.swing.JLabel();
        NorthScore = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        yourList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        eastList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        northList = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        westList = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WestScore.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        WestScore.setForeground(new java.awt.Color(0, 51, 255));
        WestScore.setText("         West");

        userScore.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        userScore.setForeground(new java.awt.Color(0, 51, 255));
        userScore.setText("          You");

        EastScore.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        EastScore.setForeground(new java.awt.Color(0, 51, 255));
        EastScore.setText("         East");

        NorthScore.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        NorthScore.setForeground(new java.awt.Color(0, 51, 255));
        NorthScore.setText("        North");

        yourList.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jScrollPane1.setViewportView(yourList);

        eastList.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jScrollPane2.setViewportView(eastList);

        northList.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jScrollPane3.setViewportView(northList);

        westList.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jScrollPane4.setViewportView(westList);

        jButton1.setText("close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(userScore, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EastScore, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NorthScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(WestScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userScore, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EastScore, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(NorthScore, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane3))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(WestScore, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible (false);
        wakeUp = false;
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ScoreBoard(5 , 6 , 7 , 8).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EastScore;
    private javax.swing.JLabel NorthScore;
    private javax.swing.JLabel WestScore;
    private javax.swing.JList eastList;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList northList;
    private javax.swing.JLabel userScore;
    private javax.swing.JList westList;
    private javax.swing.JList yourList;
    // End of variables declaration//GEN-END:variables
}
