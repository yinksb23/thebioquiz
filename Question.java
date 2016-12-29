package com.example.yinksb23.thebioquiz;

/**
 * Created by yinksb23 on 13/12/2016.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private int mQuestionId;

    public Question(int textResId, boolean answerTrue, int qID)
    {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mQuestionId = qID;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getQuestionId(){return mQuestionId;}
    public void setQuestionId (int qId){mQuestionId = qId;}

}
