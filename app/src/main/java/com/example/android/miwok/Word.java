package com.example.android.miwok;

/**
 * Created by Mehrnoosh on 11/6/2016. It contains a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;
    /** Miwok translation for the word */
    private String mMiwokTranslation;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResouceId ;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *(such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
     public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
      //   this(defaultTranslation, miwokTranslation, 0);
         mDefaultTranslation = defaultTranslation;
         mMiwokTranslation = miwokTranslation;
         mAudioResouceId = audioResourceId;
     }


     /**
       * Create a new Word object.
       * @param defaultTranslation is the word in a language that the user is already familiar with
       *(such as English)
       * @param miwokTranslation is the word in the Miwok language
       * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
     public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
            mDefaultTranslation = defaultTranslation;
            mMiwokTranslation = miwokTranslation;
            mImageResourceId = imageResourceId;
            mAudioResouceId = audioResourceId;
     }


     /**
     * Get the default translation of the word.
     */
     public String getDefaultTranslation(){

         return mDefaultTranslation;
     }

     /**
     * Get the Miwok translation of the word.
     */
     public String getMiwokTranslation(){

         return mMiwokTranslation;
     }

    /**
     * Return the iamge resource ID of the word.
     */
     public int getImageResourceId(){
        return mImageResourceId;
     }

    /**
     *Returns wheather or not there is an image for this word.
     */
    public boolean hasImage(){

        return mImageResourceId !=NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResouceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResouceId=" + mAudioResouceId +
                '}';
    }
}

