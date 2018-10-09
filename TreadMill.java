import org.omg.SendingContext.RunTime;

enum mode {walk, run};//определение типа для элемента, поддерживающего режим ходьба/бег
enum speed_switch {first, second, third};//определение типа для элемента, поддерживающего состояния скорости "первая/вторая/третья"
enum time_switch {on, off};//определение типа для элемента, поддерживающего увеличение времени

 public class TreadMill {
    mode curr_mode_but;//поле для описания состояния кнопки переключения режимов
    time_switch curr_time_but;//поле для описания состояния кнопки увеличения времени
    speed_switch curr_speed_but;//поле для описания состояния кнопки переключения скорости

    int time = 0;
    int speed = 0;
    int currTime = 0;
    int runTime = 0;
    int walkSpeed = 60;
    int firstSpeed = 120;
    int secondSpeed = 180;
    int thirdSpeed = 240;

    public static void main(String[] args) {}
    void startMode() { // начальное состояние
        curr_mode_but = mode.walk;
        curr_speed_but = speed_switch.first;
        return;
    }
    
    void setTime() {
        if (curr_time_but == time_switch.on) {
            time = time + 60;
        }
        return;
    }

    void walk() {
        setTime();
        return;
    }

    void run() { 
         currTime = java.lang.System.currentTimeMillis()*1000;
         setTime();
         setSpeed();
         return;   
    }

    void setSpeed() {
        runTime = java.lang.System.currentTimeMillis()*1000;
        if (curr_mode_but == mode.run) {
            if (curr_speed_but == speed_switch.first && (runTime - currTime > 60)) {
            currTime = time + 60;
            speed = firstSpeed;
        }
        else if (curr_speed_but == speed_switch.second && (runTime - currTime > 60)) {
            currTime = time + 60;
            speed = secondSpeed;
        } 
        else if (curr_speed_but == speed_switch.third && (runTime - currTime > 60)) {
        currTime = time + 60;
        speed = thirdSpeed;
        }
        }
        return;
    }

    void setMode() {
        if (curr_mode_but == mode.run) {
            speed = walkSpeed;
        } else setSpeed();
            return;
    }
    
 }



