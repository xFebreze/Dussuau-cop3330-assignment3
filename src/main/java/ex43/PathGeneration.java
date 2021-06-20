package ex43;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alek Dussuau
 */
import java.io.File;

public class PathGeneration {

    public static boolean websiteBase(){
        File website = new File("website");

        if(website.mkdir()){
            System.out.printf("Created %s\n", website.getPath());
            return true;
        }else{
            return false;
        }
    }

    public static boolean websiteFolder(String siteName){
        String sitePath = String.format("website/%s",siteName);
        File name = new File(sitePath);

        if(name.mkdir()){
            System.out.printf("Created %s\n", name.getPath());
            return true;
        }else{
            return false;
        }
    }

    public static boolean jsFolder(String siteName){
        String jsPath = String.format("website/%s/js", siteName);
        File js = new File(jsPath);

        if(js.mkdir()){
            System.out.printf("Created %s\n", js.getPath());
            return true;
        }else{
            return false;
        }
    }

    public static boolean cssFolder(String siteName){
        String cssPath = String.format("website/%s/css", siteName);
        File css = new File(cssPath);

        if(css.mkdir()){
            System.out.printf("Created %s\n", css.getPath());
            return true;
        }else{
            return false;
        }
    }

    public static boolean indexHtml(String siteName, String author){
        IndexHtml IH = new IndexHtml();

        String indexHtmlPath = String.format("website/%s/index.html",siteName);
        if(IH.createFile(indexHtmlPath)) {
            if (IH.writeFile(indexHtmlPath, siteName, author)){
                return true;
            }
        }
        return false;
    }
}
