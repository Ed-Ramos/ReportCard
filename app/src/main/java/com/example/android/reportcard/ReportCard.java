package com.example.android.reportcard;

/**
 * Created by Edwin on 6/19/2017.
 */

public class ReportCard {

    private int mAlgebraGrade;
    private int mEnglishGrade;
    private int mComputerGrade;
    private int mBiologyGrade;
    private int mEconomicsGrade;


    public ReportCard(int algebraGrade, int englishGrade, int computerGrade, int biologyGrade, int economicsGrade) {
        mAlgebraGrade = algebraGrade;
        mEnglishGrade = englishGrade;
        mComputerGrade = computerGrade;
        mBiologyGrade = biologyGrade;
        mEconomicsGrade = economicsGrade;
    }

    public int getAlgebraGrade() {
        return mAlgebraGrade;
    }

    public int getEnglishGrade() {
        return mEnglishGrade;
    }

    public int getComputerGrade() {
        return mComputerGrade;
    }

    public int getBiologyGrade() {
        return mBiologyGrade;
    }

    public int getEconomicsGrade() {
        return mEconomicsGrade;
    }

    public void setAlgebraGrade(int algebraGrade) {
        mAlgebraGrade = algebraGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        mEnglishGrade = englishGrade;
    }

    public void setComputerGrade(int computerGrade) {
        mComputerGrade = computerGrade;
    }

    public void setBiologyGrade(int biologyGrade) {
        mBiologyGrade = biologyGrade;
    }

    public void setEconomicsGrade(int economicsGrade) {
        mEconomicsGrade = economicsGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mAlgebraGrade=" + mAlgebraGrade +
                ", mEnglishGrade=" + mEnglishGrade +
                ", mComputerGrade=" + mComputerGrade +
                ", mBiologyGrade=" + mBiologyGrade +
                ", mEconomicsGrade=" + mEconomicsGrade +
                '}';
    }
}
