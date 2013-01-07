
import org.monte.moviemaker.MovieMakerMain;

/*
 * @(#)MovieMaker.java  1.0  2011-03-19
 * 
 * Copyright (c) 2011 Werner Randelshofer, Immensee, Switzerland.
 * All rights reserved.
 * 
 * You may not use, copy or modify this file, except in compliance with the
 * license agreement you entered into with Werner Randelshofer.
 * For details see accompanying license terms.
 */

/**
 * {@code MovieMaker}.
 *
 * @author Werner Randelshofer
 * @version 1.0 2011-03-19 Created.
 */
public class MovieMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		String folderPath = "pics";
		String songPath = "song.mp3";
		int width = 560;
		int height = 420;
		int fps = 1;
		int compression = 1;
		String internetStreaming = "fastStartCompressed";
		String outputFile = "final";
		boolean passThrough = false;
        MovieMakerMain.execute(folderPath, songPath, width, height, fps, compression, internetStreaming, outputFile, passThrough);
    }

}
