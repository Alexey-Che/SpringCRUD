package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);


//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic",
//                ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic",
//                ClassicalMusic.class);
//        System.out.println(classicalMusic1 == classicalMusic2);


//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
//
//        Random random = new Random();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",
//                MusicPlayer.class);
//        musicPlayer.playMusic();

//        Music music = context.getBean("rockMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();
//
//        Music music1 = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(music1);
//        classicalMusicPlayer.playMusic();
//        context.close();


//        ClassicalMusic classicalMusic = context.getBean("musicBean",
//                ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}
