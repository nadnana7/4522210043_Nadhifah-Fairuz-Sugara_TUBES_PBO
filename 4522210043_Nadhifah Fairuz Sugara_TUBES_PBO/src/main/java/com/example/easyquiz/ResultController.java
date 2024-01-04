package com.example.easyquiz;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.text.Text;

public class ResultController {

    @FXML
    public Label remark, marks, markstext, correcttext, wrongtext;

    @FXML
    public ProgressIndicator correct_progress, wrong_progress;

    int correct;
    int wrong;

    @FXML
    private void initialize() {
        correct = QuizController.correct;
        wrong = QuizController.wrong;

        correcttext.setText("Jawaban Benar : " + correct);
        wrongtext.setText("Jawaban Salah : " + String.valueOf(QuizController.wrong));

        marks.setText(correct + "/10");
        float correctf = (float) correct/10;
        correct_progress.setProgress(correctf);

        float wrongf = (float) wrong/10;
        wrong_progress.setProgress(wrongf);


        markstext.setText(correct + " Skor yang didapat");

        if (correct<2) {
            remark.setText("Oh tidak..! kamu telah gagal dalam kuis ini. Sepertinya kamu perlu meningkatkan pengetahuan umum kamu. Berlatihlah setiap hari! Periksa hasil kamu di sini.");
        } else if (correct>=2 && correct<5) {
            remark.setText("Ups..! Nilai yang kamu dapatkan kurang. Sepertinya kamu perlu meningkatkan pengetahuan umum kamu. Periksa hasil kamu di sini");
        } else if (correct>=5 && correct<=7) {
            remark.setText("Bagus. Sedikit peningkatan lagi mungkin akan membantu kamu mendapatkan hasil yang lebih baik. Berlatih adalah kunci kesuksesan. Periksa hasil kamu di sini.");
        } else if (correct==8 || correct==9) {
            remark.setText("Selamat! Kerja keras dan tekad kamu yang telah membantu kamu mendapatkan nilai yang bagus. Lihat hasilnya di sini.");
        } else if (correct==10) {
            remark.setText("Luar Biasa! kamu telah lulus kuis dengan nilai penuh karena kerja keras dan dedikasi kamu terhadap pelajaran. Pertahankan! Periksa hasil kamu di sini.");
        }


    }

}
