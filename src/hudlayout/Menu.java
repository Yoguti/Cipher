/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hudlayout;
import cipher_model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import com.formdev.flatlaf.FlatLightLaf;
import java.net.URI;
/**
 *
 * @author klaus
 */

public class Menu extends javax.swing.JFrame {
private String keyResult = "";
private String inputUser = "";
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        userInputFinal.setEnabled(true);
                EncryptBasePanel.setVisible(false);
                EncryptBasePanel.setEnabled(false);
                pointerEncrypt.setVisible(false);
                pointerDecrypt.setVisible(false);

        doneButton.setEnabled(false);
        copyButton.setEnabled(false);
        deleteButton.setEnabled(false);
        ChooseComboBox.removeAllItems();
        for (referenceCipher cipher : referenceCipher.values()) {
            ChooseComboBox.addItem(cipher.getName());
        }
        loreTextArea2.setText("This is an open source project, feel free to alter anything to fit your needs! Click the titles in the list to display some info about the ciphers. The box to the right takes an inputed text and encrypts it to the choosen cipher in the list. The button bellow tries to decrypt ciphers based on the given information");

        ChooseComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCipher = (String) ChooseComboBox.getSelectedItem();
                updateLabel(selectedCipher);
            }
        });
    }
        
    
    private void updateLabel(String selectedCipher) {
        // Set the text of the JLabel based on the selected item
        // For example, if the selected item is "Caesar Cipher", set the JLabel text accordingly
        switch (selectedCipher) {
            case "Caesar Cipher":
                loreTextArea2.setText("Named after the emperor Julius Caesar, this cipher involves shifting each letter in the text by a fixed number of positions down the alphabet (3 in this case). It is one of the earliest known substitution ciphers, dating back to ancient Rome.");
                break;
            case "Vigenère Cipher":
                loreTextArea2.setText("Invented by Blaise de Vigenère in the 16th century, this polyalphabetic substitution cipher uses a keyword to shift each letter in the plaintext by different amounts. It was considered unbreakable for centuries until Charles Babbage and later Friedrich Kasiski developed techniques to break it.");
                break;
            case "ROT13 Cipher":
                loreTextArea2.setText("The ROT13 cipher is a special case of the Caesar cipher where each letter is shifted by 13 positions. Since the alphabet has 26 letters, applying ROT13 twice will return the original text. It is commonly used in online forums for simple obfuscation.");
                break;
            case "Transposition Cipher":
                loreTextArea2.setText("A transposition cipher rearranges the letters of the plaintext according to a certain system, without altering the actual letters themselves. One common example is the columnar transposition cipher, where the text is written in rows and then read out column by column.");
                break;
            case "Morse Code":
                loreTextArea2.setText("Morse code is a method used in telecommunication to encode text characters as standardized sequences of two different signal durations, called dots and dashes or dits and dahs. It is named after Samuel Morse, one of its inventors, and was initially used for early telegraphy systems in the 1830s and 1840s.");
                break;
            case "Standard Galactic Alphabet":
                loreTextArea2.setText("Created by Tom Hall, the Standard Galactic Alphabet is a writing system used to depict alien languages in Commander Ken. The Standard Galactic Alphabet also appears in the game Minecraft as the script and symbols used for its Enchanting Table.");
                break;
            case "Affine Cipher":
                loreTextArea2.setText("The affine cipher is a type of monoalphabetic substitution cipher where each letter in an alphabet is mapped to its numeric equivalent, encrypted using a simple mathematical function, and then converted back to a letter. The function includes both multiplication and addition, adding complexity.");
                break;
            case "Atbash Cipher":
                loreTextArea2.setText("The Atbash cipher is a simple substitution cipher from the Hebrew alphabet where the first letter is substituted with the last, the second with the second last, and so on. It is one of the earliest known ciphers and is a type of monoalphabetic substitution.");
                break;
            
               
                
                
                
                
                
            // Add cases for other ciphers as needed
            default:
                loreTextArea2.setText(""); // Clear the text if no cipher is selected
        }
    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        keyDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        keyTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        AffineCipherDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        sideBardPanel = new javax.swing.JPanel();
        menuIcon1 = new javax.swing.JLabel();
        JPanelEncrypt1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pointerDecrypt = new javax.swing.JLabel();
        JPanelEncrypt = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pointerEncrypt = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        smallWhiteEdge = new javax.swing.JPanel();
        EncryptBasePanel = new javax.swing.JPanel();
        userInputText = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userInputFinal = new javax.swing.JTextArea();
        doneButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        ChooseComboBox = new javax.swing.JComboBox<>();
        lorePanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        loreTextArea2 = new javax.swing.JTextArea();
        panelDisplayEncryption = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        loreTextArea3 = new javax.swing.JTextArea();
        cipherNameLabel = new javax.swing.JLabel();
        copyButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        menuIcon2 = new javax.swing.JLabel();
        bgMenu = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        keyDialog.setBackground(new java.awt.Color(54, 70, 78));
        keyDialog.setForeground(new java.awt.Color(54, 70, 78));
        keyDialog.setMinimumSize(new java.awt.Dimension(316, 160));
        keyDialog.setResizable(false);
        keyDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(54, 70, 78));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 220));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 220));

        keyTextField.setBackground(new java.awt.Color(30, 30, 30));
        keyTextField.setForeground(new java.awt.Color(255, 255, 255));
        keyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Define a key");

        jButton1.setText("OK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
                okButtonHandleKey(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(keyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButton1)))
                .addGap(9, 9, 9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(keyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        keyDialog.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 220));

        AffineCipherDialog.setLocationByPlatform(true);
        AffineCipherDialog.setMinimumSize(new java.awt.Dimension(330, 430));
        AffineCipherDialog.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(54, 70, 78));
        jPanel2.setMinimumSize(new java.awt.Dimension(300, 400));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Attention!");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel3.setBackground(new java.awt.Color(30, 30, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("The Affine key needs to obey some rules to work!\n1. The key must be inputed in this format:\n'X'(any integer number of n size) \n','(a comma for dividing the ints)\n'Y'(any integer number of n size)\nexample of user input = 7,2\n\n2.The greatest common divisor of (X, 26) \nmust be == 1\n3. 1 ≤ X ≤ 25\n4. 0 ≤ Y ≤ 25\n\nThe plaintext will only be  encrypted once the \nconditions are met.\n\n");
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jTextArea1.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setText("OK");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(110, 110, 110))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AffineCipherDialogLayout = new javax.swing.GroupLayout(AffineCipherDialog.getContentPane());
        AffineCipherDialog.getContentPane().setLayout(AffineCipherDialogLayout);
        AffineCipherDialogLayout.setHorizontalGroup(
            AffineCipherDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AffineCipherDialogLayout.setVerticalGroup(
            AffineCipherDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 625));
        setMinimumSize(new java.awt.Dimension(1000, 625));

        bg.setMinimumSize(new java.awt.Dimension(1000, 625));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBardPanel.setBackground(new java.awt.Color(54, 70, 78));
        sideBardPanel.setPreferredSize(new java.awt.Dimension(210, 552));
        sideBardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hudIcons/menu.png"))); // NOI18N
        menuIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuIcon1MouseClicked(evt);
            }
        });
        sideBardPanel.add(menuIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 40, 40));

        JPanelEncrypt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPanelEncrypt1MouseClicked(evt);
            }
        });
        JPanelEncrypt1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 7));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hudIcons/secured-lock_small.png"))); // NOI18N
        jLabel2.setText("  Decrypt");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        JPanelEncrypt1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        pointerDecrypt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hudIcons/task(1).png"))); // NOI18N
        JPanelEncrypt1.add(pointerDecrypt, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 1, 20, 40));

        sideBardPanel.add(JPanelEncrypt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 210, 40));

        JPanelEncrypt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPanelEncryptMouseClicked(evt);
            }
        });
        JPanelEncrypt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 7));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hudIcons/door-key_small.png"))); // NOI18N
        jLabel1.setText("  Encrypt ");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        JPanelEncrypt.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 128, 40));

        pointerEncrypt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hudIcons/task(1).png"))); // NOI18N
        JPanelEncrypt.add(pointerEncrypt, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 1, 20, 40));

        sideBardPanel.add(JPanelEncrypt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 210, 40));

        bg.add(sideBardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 210, -1));

        cardPanel.setOpaque(false);

        smallWhiteEdge.setPreferredSize(new java.awt.Dimension(2, 552));

        javax.swing.GroupLayout smallWhiteEdgeLayout = new javax.swing.GroupLayout(smallWhiteEdge);
        smallWhiteEdge.setLayout(smallWhiteEdgeLayout);
        smallWhiteEdgeLayout.setHorizontalGroup(
            smallWhiteEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        smallWhiteEdgeLayout.setVerticalGroup(
            smallWhiteEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );

        EncryptBasePanel.setOpaque(false);
        EncryptBasePanel.setPreferredSize(new java.awt.Dimension(730, 500));

        userInputText.setBackground(new java.awt.Color(70, 70, 70));
        userInputText.setOpaque(false);
        userInputText.setPreferredSize(new java.awt.Dimension(335, 400));

        jScrollPane1.setBackground(new java.awt.Color(45, 46, 46));

        userInputFinal.setColumns(20);
        userInputFinal.setForeground(new java.awt.Color(54, 70, 78));
        userInputFinal.setLineWrap(true);
        userInputFinal.setRows(5);
        userInputFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userInputFinalactivateButton(evt);
            }
        });
        jScrollPane1.setViewportView(userInputFinal);

        javax.swing.GroupLayout userInputTextLayout = new javax.swing.GroupLayout(userInputText);
        userInputText.setLayout(userInputTextLayout);
        userInputTextLayout.setHorizontalGroup(
            userInputTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userInputTextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );
        userInputTextLayout.setVerticalGroup(
            userInputTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userInputTextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        doneButton.setBackground(new java.awt.Color(70, 70, 70));
        doneButton.setForeground(new java.awt.Color(255, 255, 255));
        doneButton.setText("Done");
        doneButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneButtonMouseClicked(evt);
            }
        });
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });
        doneButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                doneButtonKeyPressed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(70, 70, 70));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        ChooseComboBox.setBackground(new java.awt.Color(30, 30, 30));
        ChooseComboBox.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ChooseComboBox.setForeground(new java.awt.Color(255, 255, 255));
        ChooseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ChooseComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChooseComboBox.setPreferredSize(new java.awt.Dimension(60, 22));
        ChooseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseComboBoxActionPerformed(evt);
            }
        });

        lorePanel2.setBackground(new java.awt.Color(30, 30, 30));

        jScrollPane4.setBackground(new java.awt.Color(242, 242, 242));

        loreTextArea2.setEditable(false);
        loreTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        loreTextArea2.setColumns(20);
        loreTextArea2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        loreTextArea2.setForeground(new java.awt.Color(54, 70, 78));
        loreTextArea2.setLineWrap(true);
        loreTextArea2.setRows(5);
        loreTextArea2.setDisabledTextColor(new java.awt.Color(54, 70, 78));
        loreTextArea2.setEnabled(false);
        loreTextArea2.setFocusable(false);
        loreTextArea2.setVerifyInputWhenFocusTarget(false);
        loreTextArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loreTextArea2activateButton(evt);
            }
        });
        jScrollPane4.setViewportView(loreTextArea2);

        javax.swing.GroupLayout lorePanel2Layout = new javax.swing.GroupLayout(lorePanel2);
        lorePanel2.setLayout(lorePanel2Layout);
        lorePanel2Layout.setHorizontalGroup(
            lorePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(lorePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lorePanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        lorePanel2Layout.setVerticalGroup(
            lorePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
            .addGroup(lorePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lorePanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jScrollPane5.setBackground(new java.awt.Color(242, 242, 242));

        loreTextArea3.setBackground(new java.awt.Color(30, 30, 30));
        loreTextArea3.setColumns(20);
        loreTextArea3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        loreTextArea3.setForeground(new java.awt.Color(242, 242, 242));
        loreTextArea3.setLineWrap(true);
        loreTextArea3.setRows(5);
        loreTextArea3.setDisabledTextColor(new java.awt.Color(242, 242, 242));
        loreTextArea3.setVerifyInputWhenFocusTarget(false);
        loreTextArea3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loreTextArea3activateButton(evt);
            }
        });
        jScrollPane5.setViewportView(loreTextArea3);

        javax.swing.GroupLayout panelDisplayEncryptionLayout = new javax.swing.GroupLayout(panelDisplayEncryption);
        panelDisplayEncryption.setLayout(panelDisplayEncryptionLayout);
        panelDisplayEncryptionLayout.setHorizontalGroup(
            panelDisplayEncryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
            .addGroup(panelDisplayEncryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelDisplayEncryptionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelDisplayEncryptionLayout.setVerticalGroup(
            panelDisplayEncryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelDisplayEncryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelDisplayEncryptionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        cipherNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cipherNameLabel.setForeground(new java.awt.Color(255, 255, 255));

        copyButton.setBackground(new java.awt.Color(70, 70, 70));
        copyButton.setForeground(new java.awt.Color(255, 255, 255));
        copyButton.setText("Copy");
        copyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        copyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                copyButtonMouseClicked(evt);
            }
        });
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(70, 70, 70));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EncryptBasePanelLayout = new javax.swing.GroupLayout(EncryptBasePanel);
        EncryptBasePanel.setLayout(EncryptBasePanelLayout);
        EncryptBasePanelLayout.setHorizontalGroup(
            EncryptBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncryptBasePanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(EncryptBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lorePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDisplayEncryption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChooseComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EncryptBasePanelLayout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cipherNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(EncryptBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncryptBasePanelLayout.createSequentialGroup()
                        .addComponent(userInputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncryptBasePanelLayout.createSequentialGroup()
                        .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        EncryptBasePanelLayout.setVerticalGroup(
            EncryptBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptBasePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(EncryptBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EncryptBasePanelLayout.createSequentialGroup()
                        .addComponent(ChooseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lorePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDisplayEncryption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(userInputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EncryptBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(doneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cipherNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EncryptBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(copyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hudIcons/github_smally.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cardPanelLayout = new javax.swing.GroupLayout(cardPanel);
        cardPanel.setLayout(cardPanelLayout);
        cardPanelLayout.setHorizontalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanelLayout.createSequentialGroup()
                .addComponent(smallWhiteEdge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPanelLayout.createSequentialGroup()
                        .addComponent(EncryptBasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())))
        );
        cardPanelLayout.setVerticalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanelLayout.createSequentialGroup()
                .addComponent(smallWhiteEdge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(cardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EncryptBasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(cardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 73, 790, 552));

        menuIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hudIcons/menu.png"))); // NOI18N
        menuIcon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuIcon2MouseClicked(evt);
            }
        });
        bg.add(menuIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 83, -1, -1));

        bgMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hudIcons/humblerlayout.png"))); // NOI18N
        bgMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgMenuMouseClicked(evt);
            }
        });
        bg.add(bgMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 625));

        jLabel6.setText("jLabel6");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1016, 633));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void bgMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMenuMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_bgMenuMouseClicked

    private void menuIcon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuIcon2MouseClicked
        if (x == 0) {

    sideBardPanel.show();
    sideBardPanel.setSize(x, 552);

    Thread th = new Thread() {

        @Override
        public void run() {

            try {

                for (int i = 0; i <= x; i++) {

                    Thread.sleep(1);
                    sideBardPanel.setSize(i, 552);

                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);

            }

        }
    };
    th.start();

    x = 210;

}


// TODO add your handling code here:
    }//GEN-LAST:event_menuIcon2MouseClicked
        int x = 210;
    private void menuIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuIcon1MouseClicked
        if (x == 210) {

    sideBardPanel.setSize(210, 552);

    Thread th = new Thread() {

        @Override
        public void run() {

            try {

                for (int i = 210; i >= 0; i--) {

                    Thread.sleep(1);
                    sideBardPanel.setSize(i, 552);

                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);

            }

        }
    };
    th.start();

    x = 0;

}
        // TODO add your handling code here:
    }//GEN-LAST:event_menuIcon1MouseClicked

    private void userInputFinalactivateButton(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userInputFinalactivateButton

        String text = userInputFinal.getText().trim();
        if (text.length() == 0) {
            doneButton.setEnabled(false);
            deleteButton.setEnabled(false);
        } else {
            doneButton.setEnabled(true);
            deleteButton.setEnabled(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputFinalactivateButton

    private void doneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneButtonMouseClicked
        String userCipherInput = userInputFinal.getText(); // userInput
        Integer index = ChooseComboBox.getSelectedIndex(); //index 0 = cipher text
        parseInfo(userCipherInput, index );
        setInput(userCipherInput);

        // TODO add your handling code here:
    }//GEN-LAST:event_doneButtonMouseClicked

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed


        /* debug.setVisible(true);
        String result = index.toString();
        debugLabel.setText(result +  userCipherInput);*/ // test input and index of combobox
        //parseInfo(userCipherInput,index);
       // cipherConverter.setVisible(true);
       // cipherConverter.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_doneButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        userInputFinal.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void parseInfo(String userCipherInput, Integer index) {
    switch (index) {
        case 0:
            cipherNameLabel.setText("Caesar Cipher!");
            loreTextArea3.setText("");
            String finalResultCeasar = CeasarCipherBase.ceasarCipher(userCipherInput);
            loreTextArea3.setText(finalResultCeasar);
            // Caesar Cipher
            // Add Caesar cipher implementation here
                        copyButton.setEnabled(true);

            break;
        case 1:
            cipherNameLabel.setText("ROT13 Cipher!");
            loreTextArea3.setText("");
            String finalResultROT13 = ROT13.ROT13Base(userCipherInput);
            loreTextArea3.setText(finalResultROT13);
                        copyButton.setEnabled(true);

            break;
        case 2:
            cipherNameLabel.setText("Vigenère Cipher!");
                loreTextArea3.setText("");
                keyDialog.setLocationRelativeTo(null);
                keyDialog.setVisible(true);
                keyDialog.setEnabled(true);
                copyButton.setEnabled(true);


            break;
        case 3:
            cipherNameLabel.setText("Transposition Cipher!");
                loreTextArea3.setText("");
                keyDialog.setLocationRelativeTo(null);
                keyDialog.setVisible(true);
                keyDialog.setEnabled(true);
                copyButton.setEnabled(true);

            break;
        case 4:
            cipherNameLabel.setText("Morse Code!");
                loreTextArea3.setText("");
                String finalResultMorse = morseCode.morseResult(userCipherInput);
                loreTextArea3.setText(finalResultMorse);
                copyButton.setEnabled(true);

            break;
        case 5:
                cipherNameLabel.setText("Standard Galactic Alphabet!");
                loreTextArea3.setText("");
                String finalResultGalathic = galaticAlphabet.userResult(userCipherInput);
                            loreTextArea3.setText(finalResultGalathic);

                copyButton.setEnabled(true);
            break;
        case 6:
            cipherNameLabel.setText("Affine Cipher!");
                loreTextArea3.setText("");
                keyDialog.setLocationRelativeTo(null);
                keyDialog.setVisible(true);
                keyDialog.setEnabled(true);
                copyButton.setEnabled(true);            
                AffineCipherDialog.setVisible(true);
                AffineCipherDialog.setLocationRelativeTo(null);

            break;
        case 7:
            cipherNameLabel.setText("Atbash Cipher!");
                loreTextArea3.setText("");
                String finalResultAtbash = attbashCipher.attbashResult(userCipherInput);
                loreTextArea3.setText(finalResultAtbash);
                copyButton.setEnabled(true);
            break;

        default:
            throw new IllegalArgumentException("Invalid cipher index: " + index);
    }
    }
    
private String getInput(){
return inputUser;
}

private void setInput(String inputUser){
this.inputUser = inputUser;
}

    
    private void ChooseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChooseComboBoxActionPerformed

    private void loreTextArea2activateButton(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loreTextArea2activateButton
        // TODO add your handling code here:
    }//GEN-LAST:event_loreTextArea2activateButton

    private void loreTextArea3activateButton(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loreTextArea3activateButton
        // TODO add your handling code here:
    }//GEN-LAST:event_loreTextArea3activateButton

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
                EncryptBasePanel.setVisible(true);
                EncryptBasePanel.setEnabled(true);
                pointerEncrypt.setVisible(true);
                pointerDecrypt.setVisible(false);





// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
                EncryptBasePanel.setVisible(false);
                EncryptBasePanel.setEnabled(false);
                pointerEncrypt.setVisible(false);
                pointerDecrypt.setVisible(true);


// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void okButtonHandleKey(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonHandleKey
            String keyResult = keyTextField.getText();
            String userCipherInput = getInput();
            Integer index = ChooseComboBox.getSelectedIndex(); //index 0 = cipher text

             if (keyResult != null && !keyResult.isBlank()) {
            switch (index) {
            case 2:
                cipherNameLabel.setText("Vigenère Cipher!");
                String finalResultVigenere = vigenereCipher.inputPass(userCipherInput, keyResult);
                loreTextArea3.setText(finalResultVigenere);
                copyButton.setEnabled(true);
                keyDialog.setVisible(false);
            break;
            case 3:
                cipherNameLabel.setText("Transposition Cipher!");
                transpositionCipher cipher = new transpositionCipher();
                String finalResultTransposithion = cipher.transpoCipher(userCipherInput, keyResult);
                loreTextArea3.setText(finalResultTransposithion);
                copyButton.setEnabled(true);
                keyDialog.setVisible(false);
                
            break;
            case 5:
                cipherNameLabel.setText("Standard Galactic Alphabet!");
            case 4:
                String finalResultMorse = morseCode.morseResult(userCipherInput);
                loreTextArea3.setText(finalResultMorse);
                copyButton.setEnabled(true);
            break;
            case 6:
                cipherNameLabel.setText("Affine Cipher!");
                affineCipher affinecipher = new affineCipher();
                String finalResultAffine = affinecipher.affineResult(keyResult, userCipherInput);
                loreTextArea3.setText(finalResultAffine);
                copyButton.setEnabled(true);
                keyDialog.setVisible(false);
            break;

            default:
            throw new IllegalArgumentException("Invalid cipher index: " + index);
    }

            }

        // TODO add your handling code here:
    }//GEN-LAST:event_okButtonHandleKey

    private void copyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copyButtonMouseClicked
        ClipboardUtil.copyToClipboard(loreTextArea3.getText());

// TODO add your handling code here:
    }//GEN-LAST:event_copyButtonMouseClicked

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    //String finalResultVigenere = processVigenereCipher(userCipherInput, keyResult); 
    //loreTextArea3.setText(finalResultVigenere);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void keyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyTextFieldActionPerformed

    private void JPanelEncryptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanelEncryptMouseClicked
                pointerEncrypt.setVisible(true);
                 pointerDecrypt.setVisible(false);
                EncryptBasePanel.setVisible(true);
                EncryptBasePanel.setEnabled(true);
               
// TODO add your handling code here:
    }//GEN-LAST:event_JPanelEncryptMouseClicked

    private void JPanelEncrypt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanelEncrypt1MouseClicked
                EncryptBasePanel.setVisible(false);
                EncryptBasePanel.setEnabled(false);
                pointerEncrypt.setVisible(false);
                pointerDecrypt.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_JPanelEncrypt1MouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        TextFileWriter.writeToFile(loreTextArea3.getText());
        

// TODO add your handling code here:
    }//GEN-LAST:event_saveButtonMouseClicked

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
            AffineCipherDialog.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void doneButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doneButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_doneButtonKeyPressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       try {
            Desktop.getDesktop().browse(new URI("https://github.com/Yoguti"));
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          try {
        // Set FlatLaf
        FlatLightLaf.setup();

    } catch (Exception ex) {
        java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
          
          


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AffineCipherDialog;
    private javax.swing.JComboBox<String> ChooseComboBox;
    private javax.swing.JPanel EncryptBasePanel;
    private javax.swing.JPanel JPanelEncrypt;
    private javax.swing.JPanel JPanelEncrypt1;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgMenu;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JLabel cipherNameLabel;
    private javax.swing.JButton copyButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JDialog keyDialog;
    private javax.swing.JTextField keyTextField;
    private javax.swing.JPanel lorePanel2;
    private javax.swing.JTextArea loreTextArea2;
    private javax.swing.JTextArea loreTextArea3;
    private javax.swing.JLabel menuIcon1;
    private javax.swing.JLabel menuIcon2;
    private javax.swing.JPanel panelDisplayEncryption;
    private javax.swing.JLabel pointerDecrypt;
    private javax.swing.JLabel pointerEncrypt;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel sideBardPanel;
    private javax.swing.JPanel smallWhiteEdge;
    private javax.swing.JTextArea userInputFinal;
    private javax.swing.JPanel userInputText;
    // End of variables declaration//GEN-END:variables
}
