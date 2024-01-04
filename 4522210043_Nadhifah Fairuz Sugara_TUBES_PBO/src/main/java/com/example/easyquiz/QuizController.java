package com.example.easyquiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class QuizController {

    @FXML
    public Label question;

    @FXML
    public Button opt1, opt2, opt3, opt4;

    static int counter = 0;
    static int correct = 0;
    static int wrong = 0;

    @FXML
    private void initialize() {
        loadQuestions();
    }

    private void loadQuestions() {

        if (counter == 0) { //Pertanyaan 1
            question.setText("1. Huruf ke-4 dalam abjad adalah?");
            opt1.setText("A");
            opt2.setText("D");
            opt3.setText("B");
            opt4.setText("C");
        }
        if (counter == 1) { //Pertanyaan 2
            question.setText("2. Jika sendiri aku ada empat, kalau berdua jadi delapan. Siapakah aku?");
            opt1.setText("Manusia");
            opt2.setText("Kursi");
            opt3.setText("Dua Orang Manusia");
            opt4.setText("Manusia dan Kucing");
        }
        if (counter == 2) { //Pertanyaan 3
            question.setText("3. Ada apa di ujung langit");
            opt1.setText("Angkasa");
            opt2.setText("Awan");
            opt3.setText("Planet");
            opt4.setText("Huruf T");
        }
        if (counter == 3) { //Pertanyaan 4
            question.setText("4. Apa yang selalu meningkat, tidak pernah turun, dan tidak pernah tetap ?");
            opt1.setText("Umur");
            opt2.setText("Suara");
            opt3.setText("Suhu");
            opt4.setText("Gelombang");
        }
        if (counter == 4) {//Pertanyaan 5
            question.setText("5. Benda mana yang lebih berat, kapas 10kg atau besi 10kg?");
            opt1.setText("Kapas");
            opt2.setText("Besi");
            opt3.setText("Tidak ada jawaban");
            opt4.setText("Dua-duanya sama beratnya");
        }
        if (counter == 5) { //Pertanyaan 6
            question.setText("6.Apa yang bisa terbang tanpa sayap?");
            opt1.setText("Pesawat");
            opt2.setText("Burung");
            opt3.setText("Kupu-kupu");
            opt4.setText("Jam");
        }
        if (counter == 6) { //Pertanyaan 7
            question.setText("7. Aku bisa mengatur kehendak manusia. Siapakah aku?");
            opt1.setText("Takdir");
            opt2.setText("Niat");
            opt3.setText("Keinginan");
            opt4.setText("Cita-cita");
        }
        if (counter == 7) { //Pertanyaan 8
            question.setText("8. Apa yang akan dikatakan kamera saat dia hendak mengambil foto");
            opt1.setText("Tidak bicara apa-apa");
            opt2.setText("Siap-siap, ya!");
            opt3.setText("Bersiap.1,2,3");
            opt4.setText("Senyumm!");
        }
        if (counter == 8) { //Pertanyaan 9
            question.setText("9. Ketika batu dilempar ke depan, apa yang akan terjadi");
            opt1.setText("Batu hancur");
            opt2.setText("Batu hilang");
            opt3.setText("Batu jauh");
            opt4.setText("Tidak terjadi apa-apa");
        }
        if (counter == 9) { //Pertanyaan 10
            question.setText("10. Saat dibalik aku akan berkurang 3. Siapakah aku?");
            opt1.setText("9");
            opt2.setText("8");
            opt3.setText("7");
            opt4.setText("6");
        }

    }


    @FXML
    public void opt1clicked(ActionEvent event) {
        checkAnswer(opt1.getText().toString());
        if (checkAnswer(opt1.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }

    }

    boolean checkAnswer(String answer) {

        if (counter == 0) {
            if (answer.equals("A")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("Kursi")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("Huruf T")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("Umur")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("Dua-duanya sama beratnya")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("Jam")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("Niat")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("Tidak bicara apa-apa")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("Batu jauh")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("9")) {
                return true;
            } else {
                return false;
            }
        }
        return false;


    }

    @FXML
    public void opt2clicked(ActionEvent event) {
        checkAnswer(opt2.getText().toString());
        if (checkAnswer(opt2.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt3clicked(ActionEvent event) {
        checkAnswer(opt3.getText().toString());
        if (checkAnswer(opt3.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt4clicked(ActionEvent event) {
        checkAnswer(opt4.getText().toString());
        if (checkAnswer(opt4.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

}

