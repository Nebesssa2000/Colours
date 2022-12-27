package screensaver.color;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Scope("prototype")
@Data
@Component
public abstract class ColorFrame extends JFrame {
    public ColorFrame(){
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void showRandomPlace(){
        Random random = new Random();
        setLocation(random.nextInt(1200),random.nextInt(1000));
        getContentPane().setBackground(getColor());
        repaint();
    }
    protected abstract Color getColor();
}