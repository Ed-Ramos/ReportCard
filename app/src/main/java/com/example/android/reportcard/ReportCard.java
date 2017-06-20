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


    public ReportCard(int AlgebraGrade, int EnglishGrade, int ComputerGrade, int BiologyGrade, int EconomicsGrade) {
        mAlgebraGrade = AlgebraGrade;
        mEnglishGrade = EnglishGrade;
        mComputerGrade = ComputerGrade;
        mBiologyGrade = BiologyGrade;
        mEconomicsGrade = EconomicsGrade;
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

    public void setAlgebraGrade(int AlgebraGrade) {
        mAlgebraGrade = AlgebraGrade;
    }

    public void setEnglishGrade(int EnglishGrade) {
        mEnglishGrade = EnglishGrade;
    }

    public void setComputerGrade(int ComputerGrade) {
        mComputerGrade = ComputerGrade;
    }

    public void setBiologyGrade(int BiologyGrade) {
        mBiologyGrade = BiologyGrade;
    }

    public void setEconomicsGrade(int EconomicsGrade) {
        mEconomicsGrade = EconomicsGrade;
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
