
package FigurasGeometricas;

import javax.swing.JOptionPane;


public class InterfazPruebaFiguras extends javax.swing.JFrame {


    public InterfazPruebaFiguras() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtRadioCirculo = new javax.swing.JTextField();
        txtBaseRectangulo = new javax.swing.JTextField();
        txtAlturaRectangulo = new javax.swing.JTextField();
        txtBaseTriangulo = new javax.swing.JTextField();
        txtAlturaTriangulo = new javax.swing.JTextField();
        txtLadoCuadrado = new javax.swing.JTextField();
        txtLadoRombo = new javax.swing.JTextField();
        txtDiagonalMayorRombo = new javax.swing.JTextField();
        txtDiagonalMenorRombo = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        txtBaseMayorTrapecio = new javax.swing.JTextField();
        txtBaseMenorTrapecio = new javax.swing.JTextField();
        txtAlturaTrapecio = new javax.swing.JTextField();
        txtDistanciaAlturaTrapecio = new javax.swing.JTextField();
        txtPerimetroCirculo = new javax.swing.JTextField();
        txtAreaCirculo = new javax.swing.JTextField();
        txtPerimetroRectangulo = new javax.swing.JTextField();
        txtAreaRectangulo = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnReestablecer = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtPerimetroTriangulo = new javax.swing.JTextField();
        txtAreaTriangulo = new javax.swing.JTextField();
        txtHipotenusaTriangulo = new javax.swing.JTextField();
        txtTipoTriangulo = new javax.swing.JTextField();
        txtPerimetroCuadrado = new javax.swing.JTextField();
        txtAreaCuadrado = new javax.swing.JTextField();
        txtPerimetroRombo = new javax.swing.JTextField();
        txtAreaRombo = new javax.swing.JTextField();
        txtPerimetroTrapecio = new javax.swing.JTextField();
        txtAreaTrapecio = new javax.swing.JTextField();
        txtHipotenusaTrapecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Radio circulo");

        jLabel2.setText("Base rectangulo");

        jLabel3.setText("Altura rectangulo");

        jLabel4.setText("Base triangulo");

        jLabel5.setText("Altura triangulo");

        jLabel6.setText("Lado cuadrado");

        jLabel7.setText("Lado rombo");

        jLabel8.setText("Diagonal mayor Rombo");

        jLabel9.setText("Diagonal menor Rombo");

        jLabel10.setText("Area rectangulo");

        jLabel11.setText("Base mayor trapecio");

        jLabel12.setText("Base menor trapecio");

        jLabel13.setText("Altura trapecio");

        jLabel14.setText("Distancia altura trapecio");

        jLabel15.setText("Perimetro circulo");

        jLabel16.setText("Area circulo");

        jLabel17.setText("Perimetro rectangulo");

        txtBaseRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaseRectanguloActionPerformed(evt);
            }
        });

        jTextField10.setText("jTextField10");

        jTextField11.setText("jTextField11");

        txtPerimetroCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerimetroCirculoActionPerformed(evt);
            }
        });

        txtAreaCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaCirculoActionPerformed(evt);
            }
        });

        txtAreaRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaRectanguloActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnReestablecer.setText("Reestablecer");
        btnReestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReestablecerActionPerformed(evt);
            }
        });

        jLabel18.setText("Perimetro triangulo");

        jLabel19.setText("Area triangulo");

        jLabel20.setText("Hipotenusa triangulo");

        jLabel21.setText("Tipo triangulo");

        jLabel22.setText("Perimetro cuadrado");

        jLabel23.setText("Area cuadrado");

        jLabel24.setText("Perimetro rombo");

        jLabel25.setText("Area rombo");

        jLabel26.setText("Perimetro trapecio");

        jLabel27.setText("Area trapecio");

        jLabel28.setText("Hipotenusa trapecio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPerimetroCirculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(txtDistanciaAlturaTrapecio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAlturaTrapecio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBaseMenorTrapecio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBaseMayorTrapecio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDiagonalMenorRombo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDiagonalMayorRombo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLadoRombo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLadoCuadrado, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAlturaTriangulo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAlturaRectangulo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBaseRectangulo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRadioCirculo, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPerimetroTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAreaRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAreaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHipotenusaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPerimetroCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAreaCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPerimetroRombo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAreaRombo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPerimetroTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAreaTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHipotenusaTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPerimetroRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAreaCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(btnReestablecer)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtRadioCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAreaCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtBaseRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtPerimetroRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtAlturaRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtAreaRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtPerimetroTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtAlturaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtAreaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtLadoCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addComponent(txtHipotenusaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtLadoRombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTipoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtDiagonalMayorRombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)
                                    .addComponent(txtPerimetroCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtDiagonalMenorRombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(txtAreaCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBaseMayorTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel24)
                                    .addComponent(txtPerimetroRombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBaseMenorTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel25)
                                    .addComponent(txtAreaRombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAlturaTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)
                                    .addComponent(txtPerimetroTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDistanciaAlturaTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtAreaTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPerimetroCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(txtHipotenusaTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel15))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnReestablecer))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBaseRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaseRectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBaseRectanguloActionPerformed

    private void txtPerimetroCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerimetroCirculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerimetroCirculoActionPerformed

    private void txtAreaCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaCirculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaCirculoActionPerformed

    private void txtAreaRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaRectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaRectanguloActionPerformed

    private void btnReestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReestablecerActionPerformed
        // programa boton reestablecer
        txtRadioCirculo.setText("");
        txtLadoCuadrado.setText("");
        txtBaseRectangulo.setText("");
        txtAlturaRectangulo.setText("");
        txtDiagonalMayorRombo.setText("");
        txtDiagonalMenorRombo.setText("");
        txtLadoRombo.setText("");
        txtBaseMayorTrapecio.setText("");
        txtBaseMenorTrapecio.setText("");
        txtAlturaTrapecio.setText("");
        txtDistanciaAlturaTrapecio.setText("");
        txtBaseTriangulo.setText("");
        txtAlturaTriangulo.setText("");
        txtPerimetroCirculo.setText("");
        txtAreaCirculo.setText("");
        txtPerimetroCuadrado.setText("");
        txtAreaCuadrado.setText("");
        txtPerimetroRectangulo.setText("");
        txtAreaRectangulo.setText("");
        txtPerimetroRombo.setText("");
        txtAreaRombo.setText("");
        txtPerimetroTrapecio.setText("");
        txtAreaTrapecio.setText("");
        txtHipotenusaTrapecio.setText("");
        txtPerimetroTriangulo.setText("");
        txtAreaTriangulo.setText("");
        txtHipotenusaTriangulo.setText("");
        txtTipoTriangulo.setText("");
        
    }//GEN-LAST:event_btnReestablecerActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // programa boton calcular
        
        //definimos las variables de entrada
        double radioCirculo, ladoCuadrado, baseRectangulo, alturaRectangulo,diagonalMayorRombo,diagonalMenorRombo;
        double ladoRombo, baseMayorTrapecio, baseMenorTrapecio, alturaTrapecio,distanciaAlturaTrapecio;
        double baseTriangulo, alturaTriangulo;
        
        //tomamos los datos
        try{
        radioCirculo = Double.parseDouble(txtRadioCirculo.getText());
        ladoCuadrado = Double.parseDouble(txtLadoCuadrado.getText());
        baseRectangulo = Double.parseDouble(txtBaseRectangulo.getText());
        alturaRectangulo = Double.parseDouble(txtAlturaRectangulo.getText());
        diagonalMayorRombo = Double.parseDouble(txtDiagonalMayorRombo.getText());
        diagonalMenorRombo = Double.parseDouble(txtDiagonalMenorRombo.getText());
        ladoRombo = Double.parseDouble(txtLadoRombo.getText());
        baseMayorTrapecio = Double.parseDouble(txtBaseMayorTrapecio.getText());
        baseMenorTrapecio = Double.parseDouble(txtBaseMenorTrapecio.getText());
        alturaTrapecio = Double.parseDouble(txtAlturaTrapecio.getText());
        distanciaAlturaTrapecio = Double.parseDouble(txtDistanciaAlturaTrapecio.getText());
        baseTriangulo = Double.parseDouble(txtBaseTriangulo.getText());
        alturaTriangulo = Double.parseDouble(txtAlturaTriangulo.getText());
        
        //damos los datos por salida
        txtPerimetroCirculo.setText(String.valueOf(Circulo.calcularPerimetro(radioCirculo)));
        txtAreaCirculo.setText(String.valueOf(Circulo.calcularArea(radioCirculo)));
        txtPerimetroCuadrado.setText(String.valueOf(Cuadrado.calcularPerimetro(ladoCuadrado)));
        txtAreaCuadrado.setText(String.valueOf(Cuadrado.calcularArea(ladoCuadrado)));
        txtPerimetroRectangulo.setText(String.valueOf(Rectangulo.calcularPerimetro(baseRectangulo, alturaRectangulo)));
        txtAreaRectangulo.setText(String.valueOf(Rectangulo.calcularArea(baseRectangulo, alturaRectangulo)));
        txtPerimetroRombo.setText(String.valueOf(Rombo.calcularPerimetro(ladoRombo)));
        txtAreaRombo.setText(String.valueOf(Rombo.calcularArea(diagonalMayorRombo,diagonalMenorRombo)));
        txtPerimetroTrapecio.setText(String.valueOf(Trapecio.calcularPerimetro(baseMayorTrapecio,baseMenorTrapecio,distanciaAlturaTrapecio,alturaTrapecio)));
        txtAreaTrapecio.setText(String.valueOf(Trapecio.calcularArea(baseMayorTrapecio,baseMenorTrapecio,alturaTrapecio)));
        txtHipotenusaTrapecio.setText(String.valueOf(Trapecio.calcularHipotenusa(distanciaAlturaTrapecio,alturaTrapecio)));
        txtPerimetroTriangulo.setText(String.valueOf(Triangulo.calcularPerimetro(baseTriangulo,alturaTriangulo)));
        txtAreaTriangulo.setText(String.valueOf(Triangulo.calcularArea(baseTriangulo,alturaTriangulo)));
        txtHipotenusaTriangulo.setText(String.valueOf(Triangulo.calcularHipotenusa(baseTriangulo,alturaTriangulo)));
        txtTipoTriangulo.setText(String.valueOf(Triangulo.tipoDeTriangulo(baseTriangulo,alturaTriangulo)));
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Has introducido caracteres no númericos");
        }
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InterfazPruebaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPruebaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPruebaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPruebaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPruebaFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnReestablecer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField txtAlturaRectangulo;
    private javax.swing.JTextField txtAlturaTrapecio;
    private javax.swing.JTextField txtAlturaTriangulo;
    private javax.swing.JTextField txtAreaCirculo;
    private javax.swing.JTextField txtAreaCuadrado;
    private javax.swing.JTextField txtAreaRectangulo;
    private javax.swing.JTextField txtAreaRombo;
    private javax.swing.JTextField txtAreaTrapecio;
    private javax.swing.JTextField txtAreaTriangulo;
    private javax.swing.JTextField txtBaseMayorTrapecio;
    private javax.swing.JTextField txtBaseMenorTrapecio;
    private javax.swing.JTextField txtBaseRectangulo;
    private javax.swing.JTextField txtBaseTriangulo;
    private javax.swing.JTextField txtDiagonalMayorRombo;
    private javax.swing.JTextField txtDiagonalMenorRombo;
    private javax.swing.JTextField txtDistanciaAlturaTrapecio;
    private javax.swing.JTextField txtHipotenusaTrapecio;
    private javax.swing.JTextField txtHipotenusaTriangulo;
    private javax.swing.JTextField txtLadoCuadrado;
    private javax.swing.JTextField txtLadoRombo;
    private javax.swing.JTextField txtPerimetroCirculo;
    private javax.swing.JTextField txtPerimetroCuadrado;
    private javax.swing.JTextField txtPerimetroRectangulo;
    private javax.swing.JTextField txtPerimetroRombo;
    private javax.swing.JTextField txtPerimetroTrapecio;
    private javax.swing.JTextField txtPerimetroTriangulo;
    private javax.swing.JTextField txtRadioCirculo;
    private javax.swing.JTextField txtTipoTriangulo;
    // End of variables declaration//GEN-END:variables
}
