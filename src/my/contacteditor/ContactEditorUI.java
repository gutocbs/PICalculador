/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.contacteditor;

import DTO.Materia;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Turbiani
 */
public class ContactEditorUI extends javax.swing.JFrame {

    /**
     * Creates new form ContactEditorUI
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private int numeroVariaveis = 3;
    private List<Materia> listaMaterias;
    private javax.swing.ButtonGroup botoesMaterias;
    private javax.swing.JButton botaoCalcular;
    private javax.swing.JLabel labelTituloTrabalho;
    private javax.swing.JLabel labelEscolhas;
    private javax.swing.JLabel labelPrimeiraVariavel;
    private javax.swing.JLabel labelSegundaVariavel;
    private javax.swing.JLabel labelTerceiraVariavel;
    private ArrayList<JLabel> labelListVariaveis;
    private javax.swing.JRadioButton materia1;
    private javax.swing.JRadioButton materia2;
    private javax.swing.JRadioButton materia3;
    private javax.swing.JRadioButton materia4;
    private ArrayList<JRadioButton> materiaListRadioButtons;
    private javax.swing.JScrollPane janela;
    private javax.swing.JTextArea textAreaExplicacao;
    private javax.swing.JTextField textFieldPrimeiraVariavel;
    private javax.swing.JTextField textFieldResultado;
    private javax.swing.JTextField textFieldSegundaVariavel;
    private javax.swing.JTextField textFieldTerceiraVariavel;
    private ArrayList<JTextField> textListVariaveis;
    // End of variables declaration//GEN-END:variables

    public ContactEditorUI(List<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        botoesMaterias = new javax.swing.ButtonGroup();
        labelTituloTrabalho = new javax.swing.JLabel();
        labelEscolhas = new javax.swing.JLabel();

        textFieldResultado = new javax.swing.JTextField();
        botaoCalcular = new javax.swing.JButton();
        janela = new javax.swing.JScrollPane();
        textAreaExplicacao = new javax.swing.JTextArea();

        labelListVariaveis = new ArrayList<>();
        textListVariaveis = new ArrayList<>();
        for (int i = 0; i < numeroVariaveis; i++){
            textListVariaveis.add(new javax.swing.JTextField());
            labelListVariaveis.add(new javax.swing.JLabel());
        }

        materiaListRadioButtons = new ArrayList<>();
        for (int i = 0; i < listaMaterias.size(); i++)
            materiaListRadioButtons.add(new javax.swing.JRadioButton());

        setBaseText();
        addPhysicsAreas();
        textListVariaveis.get(0).addActionListener(evt -> jTextField1ActionPerformed(evt));

        botaoCalcular.setText("Calcular");
        botaoCalcular.addActionListener(evt -> botaoCalcularActionPerformed(evt));

        textListVariaveis.get(1).addActionListener(evt -> jTextField3ActionPerformed(evt));

        textAreaExplicacao.setColumns(20);
        textAreaExplicacao.setRows(5);
        janela.setViewportView(textAreaExplicacao);


        textListVariaveis.get(2).addActionListener(evt -> jTextField4ActionPerformed(evt));


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        setLayoutHorizontalGroup(layout);
        setLayoutVerticalGroup(layout);


        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setLayoutHorizontalGroup(GroupLayout layout){
        GroupLayout.SequentialGroup labelVariableTitleGroup = layout.createSequentialGroup();
        GroupLayout.SequentialGroup textFieldGroup = layout.createSequentialGroup();
        for (int i = 0; i < numeroVariaveis; i++){
            labelVariableTitleGroup.addComponent(labelListVariaveis.get(i), javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
            textFieldGroup.addComponent(textListVariaveis.get(i), javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED);
        }
        GroupLayout.SequentialGroup radioVariables = layout.createSequentialGroup();

        //Quero entender por que o limite é 3 aqui e não 4. Será que tem algo a ver com o tamanho máximo da janela?
        for (int i = 0; i < listaMaterias.size()-1; i++){
            radioVariables.addComponent(materiaListRadioButtons.get(i));
            if(i < listaMaterias.size() - 2)
                radioVariables.addGap(18, 18, 18);
        }
        GroupLayout.SequentialGroup materiasGroup = layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, radioVariables)
                        .addComponent(labelEscolhas, GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addComponent(materiaListRadioButtons.get(3));;
        GroupLayout.ParallelGroup variablesGroup = layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, labelVariableTitleGroup)
                .addGroup(textFieldGroup);
        GroupLayout.ParallelGroup areaVariaveis = layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(janela, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(textFieldResultado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(variablesGroup)
                        .addGap(245, 245, 245));
        GroupLayout.ParallelGroup grupoJanela = layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(labelTituloTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(materiasGroup)
                .addGroup(areaVariaveis)
                .addComponent(botaoCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(grupoJanela)
                                .addContainerGap(116, Short.MAX_VALUE)));
    }

    private void setLayoutVerticalGroup(GroupLayout layout){
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(labelTituloTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelEscolhas)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(materiaListRadioButtons.get(0))
                                        .addComponent(materiaListRadioButtons.get(1))
                                        .addComponent(materiaListRadioButtons.get(2))
                                        .addComponent(materiaListRadioButtons.get(3)))
                                .addGap(4, 4, 4)
                                .addComponent(janela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelListVariaveis.get(2), javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(labelListVariaveis.get(0), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(labelListVariaveis.get(1), javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textListVariaveis.get(0), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textListVariaveis.get(1), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textListVariaveis.get(2), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(botaoCalcular)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
        );
    }

    private void addPhysicsAreas(){
        int index = 0;
        for (Materia materia:this.listaMaterias) {
            materiaListRadioButtons.get(index).setText(materia.getNomeMateria());
            int finalIndex = index;
            materiaListRadioButtons.get(index).addActionListener(evt -> materiaActionPerformed(finalIndex));
            botoesMaterias.add(materiaListRadioButtons.get(index++));
        }
    }

    private void setBaseText(){
        labelTituloTrabalho.setText("Projeto Integrador 5 - Grupo 4N59");
        labelEscolhas.setText("Escolha as opções de simulação:");
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void materiaActionPerformed(int indexMateria) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        textAreaExplicacao.setText(this.listaMaterias.get(indexMateria).getTextoMateria());
        List<String> listaVariaveis = this.listaMaterias.get(indexMateria).getVariaveis();
        setVariables(listaVariaveis);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void botaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if(materia1.isSelected()){

            String textAstring = textListVariaveis.get(0).getText();
            int textA = Integer.parseInt(textAstring);
            String textBstring = textListVariaveis.get(1).getText();
            int textB = Integer.parseInt(textBstring);
            String textCstring = textListVariaveis.get(2).getText();
            int textC = Integer.parseInt(textCstring);

            int v = textA+(textB*textC);
            textFieldResultado.setText(Integer.toString(v));
        }
        if(materia3.isSelected()){

            String textAstring = textListVariaveis.get(0).getText();
            int textA = Integer.parseInt(textAstring);
            String textBstring = textListVariaveis.get(1).getText();
            int textB = Integer.parseInt(textBstring);

            int vo = textA*textB;
            textFieldResultado.setText(Integer.toString(vo));
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void setVariables(List<String> listaVariaveis){
        int index = 0;
        for (JTextField textField:textListVariaveis) {
            if(index < listaVariaveis.size()){
                textField.setEnabled(true);
                if(labelListVariaveis.size() >= index)
                    labelListVariaveis.get(index).setText(listaVariaveis.get(index));
            }
            else {
                textField.setEnabled(false);
                if(labelListVariaveis.size() >= index)
                    labelListVariaveis.get(index).setText("");
            }
            index++;
        }
    }
}