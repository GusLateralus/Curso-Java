package igu;



import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Principal extends javax.swing.JFrame {
    
    int cantSorteos=1; // Esta variable global contará la cantidad de sorteos
    // Se declara como global para evitar que cada que presione el botón de sorteo se reinicie.
    
    // Más variables globales a utilizar:
    Random numRandom;   // Numero aleatorio
    String mes; // Declaramos una variable para obtener del combobox
    int maximo, minimo; //Máximo y mínimo para números aleatorios
    
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbMes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCantGanadores = new javax.swing.JTextField();
        btnSortear = new javax.swing.JButton();
        btnCerrarSorteo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGanadores = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Datos del sorteo");

        jLabel4.setText("Mes:");

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cmbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesActionPerformed(evt);
            }
        });

        jLabel5.setText("Cant. ganadores:");

        txtCantGanadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantGanadoresActionPerformed(evt);
            }
        });

        btnSortear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSortear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loteria32x32.png"))); // NOI18N
        btnSortear.setText("Sortear");
        btnSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortearActionPerformed(evt);
            }
        });

        btnCerrarSorteo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCerrarSorteo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrado32x32.png"))); // NOI18N
        btnCerrarSorteo.setText("Cerrar Sorteo");
        btnCerrarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSorteoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSortear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCerrarSorteo, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCantGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(btnSortear)
                .addGap(42, 42, 42)
                .addComponent(btnCerrarSorteo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Ganadores");

        tblGanadores.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblGanadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posicion", "Numero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGanadores);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("      Sorteador Mercado Soriana");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/soriana128x128.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método para agregar ceros:
    public String agregarCeros(int randomDia, int randomTicket){
        
        String numSorteado;
        
        // Agregamos el cero al día, recuerda que el formato es DDMMXXXX
        if(randomDia>9)
        {
            numSorteado=randomDia+mes;
        }
        else{
            numSorteado="0"+randomDia+mes;
        }
        
        int lenString = (Integer.toString(randomTicket)).length();
        
        
        switch (lenString) {
            case 1:
                numSorteado=numSorteado+"000"+randomTicket;
                return numSorteado;
            case 2:
                numSorteado=numSorteado+"00"+randomTicket;
                return numSorteado;
            case 3:
                numSorteado=numSorteado+"0"+randomTicket;
                return numSorteado;
            case 4: 
                numSorteado=numSorteado+randomTicket;
                return numSorteado;
            default:
                return "";
        
    
    }
}
    
    private void cmbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMesActionPerformed

    private void txtCantGanadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantGanadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantGanadoresActionPerformed

    private void btnCerrarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSorteoActionPerformed
        
        if(JOptionPane.showConfirmDialog(rootPane, "¿Desea cerrar el sorteo?",
                "Finalizar",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
        
        txtCantGanadores.setText(""); // Seteamos la cantidad de ganadores como una cadena vacía
        cmbMes.setSelectedIndex(0); // El combobox también se reinicia
        
        //Opción 1: Recorrer y borrar todas las filas:
        /*DefaultTableModel modelo = (DefaultTableModel) tblGanadores.getModel();
        for(int i=modelo.getRowCount()-1;i>1;i--)
        {
            modelo.removeRow(i);
        
        }*/
        
        // Opción 2: Colocar el total de filas como cero
        DefaultTableModel modelo = (DefaultTableModel) tblGanadores.getModel();
        modelo.setRowCount(0);
        
        cantSorteos=1;
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnCerrarSorteoActionPerformed

    private void btnSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortearActionPerformed
        
        if(!txtCantGanadores.getText().equals("")){
        int cantGanadores = Integer.parseInt(txtCantGanadores.getText());

        
        if(cantSorteos<=cantGanadores){
        // Rango de valores
        mes = (String)cmbMes.getSelectedItem();
        String min = "01";
        
        String max; // Valor máximo de acuerdo a la consigna
        
        
        if (mes.equals("02")) {
            max = "28";
        } 
        else {
            if (mes.equals("04") || mes.equals("06") 
                || mes.equals("09") || mes.equals("11")) 
            {
                max = "30";
            } else {

                max = "31";

            }

        }
        
        // Sortear random 
        // Instanciamos un objeto de la clase Random
        numRandom = new Random();
        minimo= Integer.parseInt(min);
        maximo= Integer.parseInt(max);
        
        String numeroSorteado=sortear();
        boolean bandera;
        bandera=buscarRepetido(numeroSorteado); // Activamos una bandera si hay un número repetido
        
        // Agregamos el o los ceros al DDMMXXXX
        
        // Y le damos  formato al número:
        //String numeroSorteado = randomDia+mes+randomTicket ; // Hace el sorteo de un número random
        // Si no estableces un rango, estará entre el mínimo y el máximo de un entero
        // Se le agrega el mínimo porque se busca que empiece desde ahí y no desde cero
        // Si restas el máximo menos el mínimo, obtienes 29009998, por eso el +1
        // El problema radica en que el número generado está dentro del rango, pero
        // no garantiza que siga el formato DDMMXXXX, lo ideal es hacer 2 random para cada parte que necesitas
        
       
        // Agregar el ganador a la tabla (si no hubo valores repetidos):
        
        if(bandera==false){
            agregarValorATabla(cantSorteos, numeroSorteado);
            cantSorteos++;
        }
        else{
            while(bandera==true)
            {
            numeroSorteado=sortear();
            bandera=buscarRepetido(numeroSorteado);
            }
            
            agregarValorATabla(cantSorteos, numeroSorteado);
            cantSorteos++;
        }
        
        
        }
        
        
        else{
        
            JOptionPane.showMessageDialog(rootPane, "Ya se alcanzó la cantidad de ganadores");
        
        }
        
        }
        
        else{
            
            JOptionPane.showMessageDialog(rootPane, "Es necesario completar la cantidad de ganadores");
        }
        
    }//GEN-LAST:event_btnSortearActionPerformed

    public boolean buscarRepetido(String numSorteado)
    {
        boolean bandera = false;
        DefaultTableModel modelo = (DefaultTableModel)tblGanadores.getModel();
        
        for(int i=0;i<modelo.getRowCount();i++)
        {
            for(int j=0;j<modelo.getColumnCount();j++)
            {
                if(modelo.getValueAt(i, j).equals(numSorteado))
                {
                    bandera = true;
                    break;
                
                }
            
            }
        
        }
        
        return bandera;
    
    }
    
    public String sortear()
    {
        int randomDia = numRandom.nextInt(maximo-minimo+1)+minimo;
        int randomTicket = numRandom.nextInt(9999-1+1)+1;
        
        String numeroSorteado=agregarCeros(randomDia, randomTicket);
    
        return numeroSorteado;
    }
    
    public void agregarValorATabla(int cantSorteos, String numeroSorteado)
    {
        DefaultTableModel modelo = (DefaultTableModel)tblGanadores.getModel();
        Object[] objeto = {cantSorteos, numeroSorteado};
        modelo.addRow(objeto);

        //cantSorteos++;
    
    
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSorteo;
    private javax.swing.JButton btnSortear;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGanadores;
    private javax.swing.JTextField txtCantGanadores;
    // End of variables declaration//GEN-END:variables
}
