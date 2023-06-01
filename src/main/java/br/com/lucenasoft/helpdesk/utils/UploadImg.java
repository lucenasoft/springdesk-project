package br.com.lucenasoft.helpdesk.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class UploadImg {

    public static boolean uploadImg(MultipartFile img) {
        boolean success = false;
        if (!img.isEmpty()) {
            String name = img.getOriginalFilename();
            try {
                String folderUploadImg = "C:\\workspace\\springdesk-project\\src\\main\\resources\\static\\uploads";
                File dir = new File(folderUploadImg);
                if (!dir.exists()) {
                    dir.mkdirs();
                }

                File file = new File(dir.getAbsolutePath() + File.separator + name);

                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file));

                stream.write(img.getBytes());
                stream.close();

            } catch (Exception e) {
                System.out.println("Error uploading" + e.getMessage());
            }
        } else {
            System.out.println("Error, archive is empty");
        }
        return success;
    }
}
