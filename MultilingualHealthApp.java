����   D
      java/lang/Object <init> ()V  java/awt/Font
 
     $MultilingualHealthApp/HealthFontUtil getAmharicFont (II)Ljava/awt/Font;  !javax/swing/border/CompoundBorder  <MultilingualHealthApp/MultilingualHealthApp$DropShadowBorder
    9MultilingualHealthApp/MultilingualHealthApp$RoundedBorder
     (I)V
     9(Ljavax/swing/border/Border;Ljavax/swing/border/Border;)V  9MultilingualHealthApp/MultilingualHealthApp$RoundedButton  java/awt/Color
  !  " (III)V
  $  % &(Ljava/lang/String;Ljava/awt/Color;I)V
 ' ( ) * + 0MultilingualHealthApp/MultilingualHealthApp$Lang 
langSwitch ()Ljava/lang/String;	  - . / WHITE Ljava/awt/Color;
 1 2 3 4 5 javax/swing/JButton setForeground (Ljava/awt/Color;)V
 7 8 9 : ; +MultilingualHealthApp/MultilingualHealthApp getBodyFont ()Ljava/awt/Font; = 
Label.font
 ? @ A B C javax/swing/UIManager put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; E Button.font G TextField.font I TextArea.font K ComboBox.font M PasswordField.font O ToolTip.font
 Q R S T U MultilingualHealthApp/FileStore 	loadUsers ()Ljava/util/List;	 7 W X Y users Ljava/util/List; [ \ ] ^ _ java/util/List isEmpty ()Z a 0MultilingualHealthApp/MultilingualHealthApp$User c test e 1234
 ` g  h '(Ljava/lang/String;Ljava/lang/String;)V [ j k l add (Ljava/lang/Object;)Z   n o p run ()Ljava/lang/Runnable;
 r s t u v javax/swing/SwingUtilities invokeLater (Ljava/lang/Runnable;)V	 7 x y z 	container Ljavax/swing/JPanel;
 | } ~   javax/swing/JPanel 	removeAll
 7 � � � 	loginPage ()Ljavax/swing/JPanel; � Login
 | � k � )(Ljava/awt/Component;Ljava/lang/Object;)V
 7 � � � 
signupPage � Signup
 7 � � � dashboardPage � 	Dashboard
 7 � � � chatbotPage � Chatbot
 7 � � � healthCalcPage � 
HealthCalc
 7 � � � healthPlanPage � 
HealthPlan
 7 � � � savedPlansPage � 
SavedPlans
 | � �  
revalidate
 | � �  repaint � java/awt/GridBagLayout
 � 
 | �  � (Ljava/awt/LayoutManager;)V
 | � � 5 setBackground
 7 � � � modernPanelBorder ()Ljavax/swing/border/Border;
 | � � � 	setBorder (Ljavax/swing/border/Border;)V � java/awt/GridBagConstraints
 �  � java/awt/Insets
 � �  � (IIII)V	 � � � � insets Ljava/awt/Insets;	 � � � � fill I � javax/swing/JLabel
 ' � � + 
titleLogin
 � �  � (Ljava/lang/String;)V
 7 � � ; getHeaderFont
 � � � � setFont (Ljava/awt/Font;)V
 � 2
 ' � � + username  � � � makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String; � javax/swing/JTextField
 � 
 � �
 ' � � + password � javax/swing/JPasswordField
 � 
 � �
 ' � � + login
 7 � � � makeAccentButton )(Ljava/lang/String;)Ljavax/swing/JButton;
 ' � � + signup
 7 � � � makeModernButton �  
 7  makeLangButton ()Ljavax/swing/JButton;  actionPerformed !()Ljava/awt/event/ActionListener;
 1	
 addActionListener "(Ljava/awt/event/ActionListener;)V	 � � gridx	 � � gridy	 � � 	gridwidth  i(Ljavax/swing/JTextField;Ljavax/swing/JPasswordField;Ljavax/swing/JLabel;)Ljava/awt/event/ActionListener; 
 ' + 
chooseUser
 ' + 
choosePass
 '  + backToLogin   
 '%& + dashboardTitle
 '() + chatbot
 '+, + 
healthCalc
 './ + 
healthPlan
 '12 + 
savedPlans
 '45 + logout
 778 � makeDangerButton  	 
   @ java/awt/BorderLayout
?B C (II)V
 'EF + chatbotTitleH javax/swing/JTextArea
G 
G �
GLMN setEditable (Z)V
GPQN setLineWrap
GSTN setWrapStyleWordV javax/swing/JScrollPane
UX Y (Ljava/awt/Component;)V
 � 
 '\] + askHint
 �_` � setToolTipText
 'bc + ask
 'ef + back i Centerk Eastm java/awt/GridLayout
l �
 |pqN 	setOpaque
 |s kt *(Ljava/awt/Component;)Ljava/awt/Component;v Northx Southz West |} P(Ljavax/swing/JTextField;Ljavax/swing/JTextArea;)Ljava/awt/event/ActionListener; |� define
����� java/lang/String contains (Ljava/lang/CharSequence;)Z� bmi	 7��� 	isAmharic Z� �BMI በሰው ክብደትና ቁመት መጠን መሰረት የሚገኝ ልኬት ነው። ቀመር፡ BMI = ክብደት(ኪ.ግ)/ቁመት(ሜትር)^2� wBMI (Body Mass Index) is a value derived from the mass and height of a person. Formula: BMI = weight(kg) / height(m)^2.� hypertension� �Hypertension ማለት ከፍተኛ የደም ግፊት ሲሆን፤ ይህም ለልብ በሽታዎች ያለንን ተጋላጭነት ይጨምራል።� WHypertension is high blood pressure, a condition that increases risk of heart diseases.� diabetes� xDiabetes ማለት የደም የስኳር መጠን ከመጠን በላይ ሲሆን የሚከሰት በሽታ ነው።� ADiabetes is a disease that occurs when blood glucose is too high.� cholesterol� �Cholesterol በደም ውስጥ የሚገኝ ጠቃሚ የሰም ንጥረ ነገር ሲሆን በከፍተኛ መጠን ሲገኝ አደጋ ያስከትላል።� YCholesterol is a waxy substance found in your blood, important but high levels are risky.� calorie� �Calorie የኃይል መለኪያ ነው፤ ክብደትን ለመቆጣጠር ካሎሪዎችን ማመጣጠን ወሳኝ ነገር ነው።� JA calorie is a unit of energy. Managing calories is key to weight control.� 
heart rate� PHeart rate ማለት በደቂቃ ውስጥ ያለን የልብ ምት ነው።� 3Heart rate is the number of heart beats per minute.� =ይቅርታ፣ የዚህ ቃል ትርጉም የለኝም።� /Sorry, I don't have a definition for that term.� Oእባክዎ የጤና ጥያቄዎችን 'define' በማለት ይጀምሩ።� ;Please ask health-related questions starting with 'define'.
 '�� + sex� javax/swing/JComboBox
 '��� sexes ()[Ljava/lang/String;
�� � ([Ljava/lang/Object;)V
� �
 '�� + age
 '�� + height
 '�� + weight
 '�� + 
bloodGroup� A+� A-� B+� B-� AB+� AB-� O+� O-
 '�� + calc 
GB �� �(Ljavax/swing/JComboBox;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JComboBox;Ljavax/swing/JTextArea;)Ljava/awt/event/ActionListener; �� �(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextArea;)Ljava/awt/event/ActionListener;@2�     � Underweight@8�fffff� Normal weight@=�fffff� 
Overweight� Obese� ዝቅተኛ ክብደት� መደበኛ ክብደት� #ከመጠን በላይ ክብደት  7በጣም ከመጠን በላይ የሆነ ክብደት
 ' + 
createPlan
 ' + planDesc
 '	 + planHint
 ' + date
 java/util/Calendar getInstance ()Ljava/util/Calendar;
 get (I)I
� 
 java/lang/Integer valueOf (I)Ljava/lang/Integer;
� ! addItem (Ljava/lang/Object;)V # o$ ^(Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;III)Ljava/lang/Runnable; &' 5(Ljava/lang/Runnable;)Ljava/awt/event/ActionListener;
� &+,- o  java/lang/Runnable
 '/0 + time2 %02d
�456 format 9(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;8 AM: PM
 '<= + savePlan @ java/awt/FlowLayout
? !C -E : GH �(Ljavax/swing/JTextField;Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JLabel;IILjava/lang/Runnable;I)Ljava/awt/event/ActionListener; JK �(Ljavax/swing/JTextField;Ljavax/swing/JComboBox;ILjavax/swing/JComboBox;ILjava/lang/Runnable;Ljavax/swing/JComboBox;ILjavax/swing/JLabel;)Ljava/awt/event/ActionListener;
 'MN + savedHealthPlans	 7PQR 	plansArea Ljavax/swing/JTextArea;
 'TU + 
backToDash
 'WX + 
clearPlans 
 |   	 7^2 Y
 '`a + noPlans
Gcd � setTextf java/lang/StringBuilder
e  [ijk size ()I [mn (I)Ljava/lang/Object; p �q '(ILjava/lang/String;)Ljava/lang/String;
estu append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
ewx + toString	 7z{| frame Ljavax/swing/JFrame;
 '~ + clearConfirm
 '�� + confirmClear� javax/swing/JOptionPane
���� showConfirmDialog <(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)I [��  clear	 7��� currentUser Ljava/lang/String;
 Q��� 	savePlans %(Ljava/lang/String;Ljava/util/List;)V
 7��  updateSavedPlansArea	 7��� layout Ljava/awt/CardLayout;
����� java/awt/CardLayout show )(Ljava/awt/Container;Ljava/lang/String;)V
 7��  addAllPages�  
 �c
���! setSelectedItem
 �c
 ��� + getText
��� + trim
���� getSelectedItem ()Ljava/lang/Object;� %04d-%02d-%02d
��� &(Ljava/lang/Object;)Ljava/lang/String; � �� J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
� \
 '�� + pleasePlanDate � �� n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
 '�� + 	planSaved
��k intValue
�� " set
�� getActualMaximum
���k getItemCount
���  removeAllItems
���n 	getItemAt
��� parseInt (Ljava/lang/String;)I
����� java/lang/Double parseDouble (Ljava/lang/String;)D
 '�� + positiveNumbers@Y      � BMI: � %.2f
��� (D)Ljava/lang/Double;
 7��� bmiStatusAmharic (D)Ljava/lang/String;
 7��� 	bmiStatus  �
��� + toLowerCase� 	ወንድ� male@$      @      @      @d       8 መሰረታዊ የሰውነት ስርዓት ተመን:	 BMR (Basal Metabolic Rate):  %.0f  ካሎሪ/ቀን 	 kcal/day !�@I      @ffffff@Q��R@N      @F�      ተመጣጣኝ ክብደት:  Ideal Weight:    ኪ.ግ"  kg?�333333?�p��
=q@0333333@������, "የሰውነት ስብ መጠን: . Body Fat Percentage:  "0 �1 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;?�      5 %ወገብ ከቁመት ንፅፅር: 7 Waist-to-Height Ratio: 9 - (ተመጣጣኝ ከ0.5 ያነሰ ሲሆን);  (Ideal < 0.5)= "የደም ዓይነት መረጃ: ? Blood Group Info:  # �
�BCk hashCode
�EF l equalsH bA+ የደም ዓይነት የተለመደ እና ከA+ እና AB+ ጋር የሚጣጣም ነው።J 8A+ blood group is common and compatible with A+ and AB+.L bB+ የደም ዓይነት የተለመደ እና ከB+ እና AB+ ጋር የሚጣጣም ነው።N 8B+ blood group is common and compatible with B+ and AB+.P >AB+ ከሁሉም የደም ዓይነት ተቀባይ ነው።R  AB+ is universal blood acceptor.T QO+ የተለመደ እና ለሁሉም የደም ዓይነቶች ሰጪ ነው።V 4O+ is common and universal donor to all blood types.X yያልተለመደ የደም ዓይነት፤ እባክዎ የደም መለገሻ መመሪያዎችን ይመልከቱ።Z ;Rare blood group; please consult blood donation guidelines.\ 
^ 
የጤና ምክር:
` 
Health Advice:
b u- ዝቅተኛ ክብደት ነው ያሎት፣ የተመጣጠነ የአመጋገብ ስርዓትን ያዳብሩ።d C- You are underweight. Consider a balanced diet with more calories.f �- ተመጣጣኝ ክብደት ነው ያሎት፣ የዘውትር እንቅስቃሴዎትን እና ጤናማ አመጋገብዎን ይቀጥሉ።h M- You have a normal weight. Keep up with regular exercise and healthy eating.j �- ከመጠን በላይ ክብደት ነው ያሎት፤ የአካል እንቅስቃሴ ያሳድጉ እንዲሁም የአመጋገብ ስርዓትዎን ይቆጣጠሩ።l A- Overweight. Try to increase physical activity and monitor diet.n w- በጣም ከመጠን በላይ የሆነ ክብደት ነው ያሎት፣ የጤና ባለሙያ ያነጋግሩ።p '- Obese. Consult a healthcare provider.r �- ዘወትር የልብ እና የደም ዝውውርን የሚያዳብሩ እንቅስቃሴዎችን ያድርጉ
- በቂ ውሃ ይጠጡ እና በጣም የበሰሉ ምግቦችን አይጠቀሙt f- Regular cardiovascular exercise is recommended.
- Stay hydrated and avoid excessive processed foods. $ �w java/lang/NumberFormatException
 'yz + validNumbers| እርስዎ~ You %0
G�t �� መሣሪያ� Bot
 7�� � getChatbotResponse &0
 �c
 ���� getPassword ()[C
�� � ([C)V
 '�� + pleaseEnterUserPass [��� iterator ()Ljava/util/Iterator;���� _ java/util/Iterator hasNext���� next	 `� ��
 '�� + signupTaken
 Q��� 	saveUsers (Ljava/util/List;)V
 '�� + signupSuccess	 `� ��
 '�� + loginSuccess
 Q��� 	loadPlans $(Ljava/lang/String;)Ljava/util/List;
 '�� + invalidUserPass� javax/swing/JFrame� Health Management
� �
���  setDefaultCloseOperation
���C setSize
� �
���Y setLocationRelativeTo
� 
 |�� � 	setLayout
���� setContentPane (Ljava/awt/Container;)V
���N 
setVisible� java/util/ArrayList
�  	Signature DLjava/util/List<LMultilingualHealthApp/MultilingualHealthApp$User;>; $Ljava/util/List<Ljava/lang/String;>; Code LineNumberTable LocalVariableTable this -LMultilingualHealthApp/MultilingualHealthApp; text MethodParameters btnLang Ljavax/swing/JButton; main ([Ljava/lang/String;)V args [Ljava/lang/String; amharicFont Ljava/awt/Font; StackMapTable panel gbc Ljava/awt/GridBagConstraints; lblTitle Ljavax/swing/JLabel; lblUser tfUser Ljavax/swing/JTextField; lblPass pfPass Ljavax/swing/JPasswordField; btnLogin 	btnSignup msgLabel btnBack 
btnChatbot btnHealthCalc btnHealthPlan btnSavedPlans 	btnLogout chatArea scroll Ljavax/swing/JScrollPane; 
inputField sendBtn backBtn bottomPanel 	leftPanel input lblSex sexBox Ljavax/swing/JComboBox; lblAge ageField 	lblHeight heightField 	lblWeight weightField lblBloodGroup bloodGroupBox calcBtn 
resultArea y LocalVariableTypeTable +Ljavax/swing/JComboBox<Ljava/lang/String;>; D m i lblPlan 	planField lblDate today Ljava/util/Calendar; thisYear 	thisMonth thisDay yearBox monthBox dayBox 
updateDays Ljava/lang/Runnable; lblTime hourBox 	minuteBox ampmBox btnSave 	datePanel 	timePanel ,Ljavax/swing/JComboBox<Ljava/lang/Integer;>; btnClear sb Ljava/lang/StringBuilder; lambda$savedPlansPage$2 (Ljava/awt/event/ActionEvent;)V e Ljava/awt/event/ActionEvent; 	confirmed lambda$savedPlansPage$1 lambda$savedPlansPage$0 lambda$healthPlanPage$5 �(Ljavax/swing/JTextField;Ljavax/swing/JComboBox;ILjavax/swing/JComboBox;ILjava/lang/Runnable;Ljavax/swing/JComboBox;ILjavax/swing/JLabel;Ljava/awt/event/ActionEvent;)V lambda$healthPlanPage$4 �(Ljavax/swing/JTextField;Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JLabel;IILjava/lang/Runnable;ILjava/awt/event/ActionEvent;)V year Ljava/lang/Integer; month day fullPlanB java/awt/event/ActionEvent lambda$healthPlanPage$3 lambda$healthPlanPage$2 3(Ljava/lang/Runnable;Ljava/awt/event/ActionEvent;)V lambda$healthPlanPage$1 lambda$healthPlanPage$0 K(Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;III)V d cal maxDay selectedDay lambda$healthCalcPage$2 ~(Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextArea;Ljava/awt/event/ActionEvent;)V lambda$healthCalcPage$1 �(Ljavax/swing/JComboBox;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JComboBox;Ljavax/swing/JTextArea;Ljava/awt/event/ActionEvent;)V bmr s0$ tmp1$ heightCm weightKg heightM idealWeight bodyFat waist whr ex !Ljava/lang/NumberFormatException;^ java/lang/CharSequence lambda$healthCalcPage$0 lambda$chatbotPage$2 N(Ljavax/swing/JTextField;Ljavax/swing/JTextArea;Ljava/awt/event/ActionEvent;)V lambda$chatbotPage$1 question lambda$chatbotPage$0 lambda$dashboardPage$5 lambda$dashboardPage$4 lambda$dashboardPage$3 lambda$dashboardPage$2 lambda$dashboardPage$1 lambda$dashboardPage$0 lambda$signupPage$2 g(Ljavax/swing/JTextField;Ljavax/swing/JPasswordField;Ljavax/swing/JLabel;Ljava/awt/event/ActionEvent;)V lambda$signupPage$1 u 2LMultilingualHealthApp/MultilingualHealthApp$User; i$ Ljava/util/Iterator; user pass lambda$signupPage$0 lambda$loginPage$2 lambda$loginPage$1 found lambda$loginPage$0 lambda$main$0 <clinit> 
SourceFile MultilingualHealthApp.java NestMembers ;MultilingualHealthApp/MultilingualHealthApp$RoundedButton$1 BootstrapMethods �
 7�y � :2�
 7�x2�
 7�vl�
 7�ul�
 7�t2�
 7�ml�
 7�kl�
 7�j2�
 7�i2�
 7�h2�
 7�g2�
 7�f2�
 7�e2�
 7�d2�
 7�ba�
 7�`a�
 7�_2�
 7�OP�
 7�MN�
 7�GH�
 7�FE�
 7�DE�
 7�C2�
 7�:;�
 7�89�
 7�72�
 7�62�
 7�12� . 
� : �  | :  | : �  - 
� 
� %
� 
� 
� : 
� : 

�
����� "java/lang/invoke/LambdaMetafactory metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;�
��� �� $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses DropShadowBorder RoundedBorder RoundedButton Lang User %java/lang/invoke/MethodHandles$Lookup java/lang/invoke/MethodHandles Lookup ! 7     {|    y z   ��   ��    X Y �   � 2 Y �   � QR   ��   2    �   /     *� �   �       �       ��    � ; �         � 	�   �         : ; �         � 	�   �         � � �   0      � Y� Y� � Y� � �   �         � � �   C     � Y*� Y' �`�  � #�   �       t�       ��  �   �    � � �   D     � Y*� Y4 � ۷  � #�   �       w�       ��  �   �   8 � �   C     � Y*� Y �L<�  � #�   �       z�       ��  �   �    �   W     %� Y� &� Y � ��  � #K*� ,� 0*�   �       }  ~ # �      	��   	�� �   �     h� 6L<+� >WD+� >WF+� >WH+� >WJ+� >WL+� >WN� 	� >W� P� V� V� Z � � V� `Ybd� f� i W� m  � q�   �   2    �  �  �  �  �   � ' � . � : � @ � _ � g ��       h��    d�� �    � _ �   �   �  �   �      `� w� {� w� ��� �� w� ��� �� w� ��� �� w� ��� �� w� ��� �� w� ��� �� w� ��� �� w� �� w� ��   �   .    �  �  �  � ' � 2 � = � H � S � Y � _ �  � � �  �    �� |Y� �Y� �� �K*� Y � � ��  � �*� �� �� �Y� �L+� �Y� õ �+� ʻ �Y� з �M,� ֶ �,� Y) � ��  � ݻ �Y� ޺ �  � �N� �Y� �:� 6� � �Y� � �  � �:� �Y� �:� 6� � � �:� �� �:� �Y�� �:		� 6� �	� Y �9+�  � ݸ �:

�  �+�+�+�*,+� �+�+�+�*-+� �+�*+� �+�+�*+� �+�*+� �+�+�*+� �+�*+� �+�+�+�*	+� �+�+�+�*
+� �	�  �	�  �*�   �   � &   �  � # � * � 2 � E � J � U � \ � o �  � � � � � � � � � � � � � � � � � � � � � � �

%1BN_kz����6�<�   p  �� z   2���  Ud��  :��  �/��  ���  ���  � ���  � ���  � ��� 	 � ��� 
  � � �  �    �� |Y� �Y� �� �K*� Y � � �  � �*� �� �� �Y� �L+� �Y� õ �+� ʻ �Y� �� �M,� ֶ �,� Y) � ��  � ݻ �Y�� �  � �N� �Y� �:� 6� � �Y�� �  � �:� �Y� �:� 6� � �� �:�� �:� �Y�� �:		� 6� ٸ �:

�!  �+�+�+�*,+� �+�+�+�*-+� �+�*+� �+�+�*+� �+�*+� �+�+�*+� �+�*+� �+�+�+�*	+� �+�+�+�*
+� �	�"  �	�#  �*�   �   � %  A B #C *D 2E EF JH UI \J oK L �M �N �O �P �R �S �T �U �V �W �] �^ �`abd/e;gLhXjgknm}n�p�����   p  �� z   2t��  UQ��  '��  ���  ���  � ���  � ���  � ���  � ��� 	 � ��� 
  � � �  Q  	  W� |Y� �Y� �� �K*� Y � � ��  � �*� �� �� �Y� �L+� �Y� õ �+� ʻ �Y�$� �M,� ֶ �,� Y) � ��  � ݸ'� �N�*� �:�-� �:�0� �:�3�6:� �:�9  �+�+�+�*,+� �+�+�+�*-+� �+�*+� �+�+�*+� �+�*+� �+�+�+�*+� �+�+�+�*+� �-�:  ��;  ��<  ��=  ��>  �*�   �   � !  � � #� *� 2� E� J� U� \� o� v� ~� �� �� �� �� �� �� �� �� �� �� �� �����$�-�7�A�K�U��   \ 	 H� z   2%��  U��  v ���  ~ ���  � ���  � ���  � ���  � ���   � � �  D  
  @� |Y�?Y

�A� �K*� �� �*� Y � � �  � �� �Y�D� �L+� ֶ �+� Y) � ��  � ݻGY�IM,� 6�J,�K,�O,�R�UY,�WN� �Y�Z:� 6� ��[�^�a� �:�d� �:� �:�g  �� |Y�?Y�A� �:h� �j� �� |Y�lY�n� �:		�o	�rW	�rW*+u� �*-h� �*w� �*	y� �,�{  �,�~  �*�   �   � !  � � � .� 9� @� S� [� b� g� l� q� z� �� �� �� �� �� �� �� �� �� �� �� �� ���
���$�1�>��   f 
 -� z   9��  [ ��R  z ���  � � �  � ��  � ��  � ���  � | z  � T z 	 � � �  �     �*��� �*���� ��� 	�� ��*���� ��� 	�� ��*���� ��� 	�� ��*���� ��� 	�� ��*���� ��� 	�� ��*���� ��� 	�� ����� 	�� ����� 	�� ��   �   � '  � 
� � �  � #� $ . 4 : = > H N T	 W X b h n q r | � � � � � � � � � � � � � � �  ��       ��  �   1  B� B� B� B� B� B� B� B��       � � �  �    ߻ |Y� �Y� �� �K*� �� �*� Y � � ��  � �� �Y� �L+� �Y



� õ �+� ʻ �Y�*� �M,� ֶ �,� Y) � ��  � ݻ �Y��� �  � �N��Y����:� 6�û �Y�ĺ �  � �:� �Y�Z:� 6� � �Y�Ǻ �  � �:� �Y�Z:� 6� � �Y�ʺ �  � �:	� �Y�Z:

� 6� � �Y�ͺ �  � �:��Y��Y�SY�SY�SY�SY�SY�SY�SY�S��:� 6�ø� �:�d� �:� �:��  ��GY��:�K�O�R� 6�J�UY�W:+�+�+�*,+� �6+�+�+�*-+� �+�*+� ��+�+�*+� �+�*+� ��+�+�*+� �+�*+� ��+�+�*	+� �+�*
+� ��+�+�*+� �+�*+� ��+�+�*+� �+�*+� ��+�+�+�*+� �+`�+�+�*+� �
��  �
��  �*�   �   � ?  % & ' *( 2) E* J, U- \. o/ 0 �1 �2 �3 �4 �5 �6 �7 �8 �9 �: �;
<J=R?Z@bAgBqH~I�J�K�L�M�O�P�R�S�T�U�V�W�X�YZ[\"]4^@_C`Uaabdcvd�e�f�g�i�j�l�����   �  �� z   2���  U���  `�  �T  �;	�  �2
�  ��  ��  ��� 	 ��� 

�� J� Z�� b}� gx�� ~aR �<�� �$ �      �T J�  �� �   i     (&똜 ��& �&� ����   �      � � � $��       (�  �    �   �   �� �   i     (&똜 ��& ��&� ����   �      � � � $��       (�  �    �   �    � � �  �    ˻ |Y� �Y� �� �K*� �� �*� Y � � �  � �� �Y� �L+� �Y� õ �+� ʻ �Y�� �M,� ֶ �,� Y) � ��  � ݻ �Y�� �  � �N� �Y� �:� 6� ���^� �Y�
� �  � �:�:�6�6�6	��Y�:
6d`� 
�������Y�:6� �������Y�:
	�"  :
�%  �(�)  �(�* � �Y�.� �  � �:��Y�:6�  1� Y�S�3����߻�Y�:6<�  1� Y�S�3����߻�Y��Y7SY9S��:� 6��� 6��� 6�ø;� �:�d� �:� �:�>  �� �Y�� �:� 6� �+�+�+�*,+� �+�+�+�*-+� �+�*+� �+�+�*+� �� |Y�?Y�A� �:� Y � � �  � �
�rW� �YB� ӶrW�rW� �YB� ӶrW�rW+�*+� �+�+�*+� �� |Y�?Y�A� �:� Y � � �  � ��rW� �YD� ӶrW�rW�rW+�*+� �+�+�*+� �+�*+� �+�+�+�*+� �+�+�+�*+� �
	�F  �
	�I  �*�   �   G  � � � *� 2� E� J� U� \� o� � �� �� �� �� �� �� �� �� �� �� ����.:FM^g��	�
������!06;KW h"{#�$�%�&�'�(�)�+�,�-./%0-152A3R4^5t6�8�T�_�    �  �  �  � j $ � � $ �  �� z   2���  Uv��  L�  �A�  � �  �  � �  � �  �  � 	 ��! 
 ��" �# .�$% ^m&� gd' �4( ��) ��*� ���� ��� ��� {P+ z � �, z    >  ��!- 
 ��"- �#- gd' �4( ��) �   q � �  | � � � � ��  � � �� � W  | � � � � ����+ ��  � #� �� #  � � �  �     � |Y�?Y

�A� �K*� �� �*� Y � � ��  � �� �Y�L� �L+� ֶ �+� Y) � ��  � ݲO�K�O�O�O�R�O� 6�J�UY�O�WM�S� �N�V�6:� �:�Y  �� |Y�Z:�o�rW-�rW�rW*+u� �*,h� �*w� �-�[  ��\  �*�   �   j   d e f .g 9h @i Sj Zk al hm qn |p �q �r �s �y �z �{ �| �} � �� �� �� �� ���   H   �� z   9 ���  | r��  � k��  � c.�  � ^��  � K z  �  �   �     `�O� 6�J�]� Z � �O�_�b� B�eY�gK<�]�h � "*`�]�l ���o  �rW���زO*�v�b�   �   & 	  � 	� �  � (� 6� O� U� _��     * + �  ( 7/0  �     � 	e� *� 	
12 �   �     '�y�}����<� �]�� ���]�����   �   & 	  � � � 
� � � � #� &��       '34    5 � �    � &
62 �   6     ��� w����   �      ��       34  
72 �   e      ��� � ��������� w����   �      t u v w x�        34  �    
@
89 �   �  
   >*���+���-`����* ��������� w����   �   "   U W X Y !Z +[ 2\ =]�   f 
   >�     >!    > �    >"    > �    >$%    >#    >  �    >��    >34 	
:; �  �    *����:+���:,���:-���:� )� $� �� YSYSYS�3� �:��������������  :��� ��� � Y �9+�  � �������
�.��  :�]� i W���]��� Y' �`�  � ��Ķ�*���+���,	`���
�* -����   �   ^   9 	: ; < $= 3> O? TA sB �C �D �E �G �H �I �J �K �L �N �O �PQR�   �   �    !   "   #   '   (   )   ��    �    � 	  $% 
    �   34  	�   �<=   �>=  $ �?=  T ��  s �0�  � [@� �   D � O  ������� �+A�  B�� 0��
C2 �   ^     ��� � ������� w����   �         �       34  �    
@
DE �   ;     *�* �   �      �       $%     34 
FE �   ;     *�* �   �      �       $%     34 
GH �  �     �*�����6+�����6�:d����6	,�О ,����ǧ 6
,��6	� +� `� � � ,������,�О 1
,����ǡ !
,,��d����ǣ ,
����   �   >   � � � � )� 1� H� L� V� o� x� ~� �� �� � �   z  O /I �    �!     �"    �#    � �    � �    �  �   �< �   �> �   �J  1 �K � 	 H lL � 
�   ( � E 
���  @� � 4
MN �   �     (*���+���,���-��b��� w����   �      � � � � � '��   4    (
�     (�    (�    (R    (34 
OP �  T     %*����:+������6,������9	-������9����:� 	�� 
�� ��b�	�o9�eY�g:ko9��� 	� ��� Y��S�3��� �� ���  �rW����� 	�� ���6� �k 	kch�gc9� �k 	kch�gg9��� 	� 
� Y��S�3��� 	� �  �rW� 	ogkc� 	ogkc9��� 	� �� Y��S�3��� 	� !�  �rW#k%�kc� 	'� )g9��� 	+� -�� Y��S�3�/  �rW	2k9	o9��� 	4� 6�� Y��S�3��� 	8� :�  �rW��� 	<� >�@  �rW:6�A�   j     
   )  )   :  	�   \  �*   KжD� 96� 3ԶD� (6� "ضD� 6� ܶD� 6�   }             5   M   e��� 	G� I�rW� `��� 	K� M�rW� H��� 	O� Q�rW� 0��� 	S� U�rW� ��� 	W� Y�rW[�rW��� 	]� _�rW똜 ��� 	a� c�rW� Z ��� 	e� g�rW� 9� ��� 	i� k�rW� ��� 	m� o�rW��� 	q� s�u  �rW�v�b� :�x�b�    Rv Sv �   � 0  n 	o p !q -r 7t Ju Rv Sy [z d} n~ �� �� �� �� �;�@�U�i�����������9�S��� ��0�H�]�f�{�������������������$��   �  � Q WR� ZS �  	��  � �  !�T 	 -�U  7���  [�V  d�/0  n��  Q  �Q�� i�W �TX � Y �Z  [\   %    %
�   %�   %�   %   %R   %34 �  C E� J � � � ��GA��  � ( � � � ��GA��e e�  � � � ��GA��e e��  � � � ��GA��e e���  � � � ��GA��e e���Y��  � � � ��GA��e �]� %  �  � � � ��GA��e  Me�  � � � ��GA��e e��  � � � ��GA��e e���  � � � ��GA��e e���"Q�  � � � ��GA��e e�  � � � ��GA��e e��  � � � ��GA��e e���  � � � ��GA��e e���a�  � � � ��GA��e �  � � � ��GA��e e�  � � � ��GA��e e�� 7 � � � ��GA��e e�  � � � ��GA��e e��  � � � ��GA��e e���  � � � ��GA��e e���Ve�  � � � ��GA��e e�� =�Me�  � � � ��GA��e� e�Me�  � � � ��GA��e� e�Me�  � � � ��GA��e� e�Me�  � � � ��GA��e� e�Me�  � � � ��GA��e� e�� Ve�  � � � ��GA��e e�Ze�  � � � ��GA��e e�Ve�  � � � ��GA��e e�Ve�  � � � ��GA��e e�Me�  � � � ��GA��e e�Me�  � � � ��GA��e e��  � � � ��GA v	
_2 �   ^     ��� � ������� w����   �      C D E F�       34  �    
@
`a �   d     *���+��b��� w����   �      � � � ��         �     �R    34 
ba �   �     S*������N-��� �+��� 	{� }*���  ��+��� 	�� �-����  ��*����   �      � � � /� K� R��   *    S �     S�R    S34   Hc� �   B � �LG�   �GA� G�XG�   �GA� G�
d2 �   ^     ��� � ������� w����   �      � � � ��       34  �    
@
e2 �   N     ���]�� ��� w����   �      � � � ��       34  
f2 �   A     ����� w����   �      � � ��       34  
g2 �   6     ��� w����   �      ��       34  
h2 �   6     ��� w����   �      ��       34  
i2 �   6     ��� w����   �      ��       34  
j2 �   ^     ��� � ������� w����   �      � � � ��       34  �    
@
kl �   x      *���+���,������ w����   �      � � � � ��   *     ��      ��     ��     34 
ml �  ^     �*����:��Y+����:��� ��� ,������ V�� :�� � '�� � `:���D� ,�������ղ V� `Y� f� i W� V��,����*���+����   �   B   q 	r s &t -u .w Nx [y bz c| f} z~ � �� �� ���   R  N no  8 .pq    ���     ���    ���    �34  	 �r�   �s� �    � &��� 	�*� 
t2 �   ^     ��� � ������� w����   �      X Y Z [�       34  �    
@
ul �   x      *���+���,������ w����   �      7 8 9 : ;�   *     ��      ��     ��     34 
vl �  �  	   �*����:��Y+����:��� ��� ,�����6� V�� :�� � 2�� � `:���D� ���D� 	6� ���� F,� Y' �`�  � �,����*���+����������]��� w���� ,� Y �9+�  � �,�����   �   Z    	  & - .! 1" Q# k$ n% q' t( y) �* �+ �, �- �. �/ �1 �2 �4�   \ 	 Q  no  ; 9pq    ���     ���    ���    �34  	 �r�   �s�  1 �w� �    � &��� �5� � G
x2 �   ^     ��� � ������� w����   �         �       34  �    
@
y  �   �      y��Y����y�y���y����y� Y � � ��  �Ĳy�Ż |Y�Z� w��Y�ȳ�� w���ɸ��y� w�̲�� w����y�б   �   6    �  �  �   � 6 � = � G � Q � Z � ] � f � q � x � z  �   S      +����Y�ճ V��Y�ճ]�GY
��O���   �              &  {   |}     ' ` ~  �  \ '� ���� �� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� ���� �� �� �� �� �� �� �� �� �� ��   :   7�   7�   7�  ' 7�  ` 7� ~        