
enum mode {walk, run};//определение типа для элемента, поддерживающего режим ходьба/бег
enum speed_switch {first, second, third};//определение типа для элемента, поддерживающего состояния скорости "первая/вторая/третья"
enum time_switch {on, off};//определение типа для элемента, поддерживающего увеличение времени

 public class TreadMill {
    mode curr_mode_but;//поле для описания состояния кнопки переключения режимов
    time_switch curr_time_but;//поле для описания состояния кнопки увеличения времени
    speed_switch curr_speed_but;//поле для описания состояния кнопки переключения скорости

    int time = 0;
    int speed = 0;
    int walk_speed = 60;
    int first_speed = 120;
    int second_speed = 180;
    int third_speed = 240;

    public static void main(String[] args) {}
    void startMode() { // начальное состояние
        curr_mode_but = mode.walk;
        curr_speed_but = speed_switch.first;
        return;
    }
    
    void setTime() {
        if (curr_time_but == time_switch.off) {
            time=time + 60;
        }
        return;
    }

    void walk() {
        setTime();
        return;
        }

    void run()
        { 
         setTime();
         setSpeed();   
        }

    void setSpeed() {
        if(curr_mode_but == mode.run) {
            if(curr_speed_but==speed_switch.first) {
            speed=first_speed;
        }
        else if(curr_speed_but == speed_switch.first) {
            speed = second_speed;
        } 
        else speed = third_speed;
        }
        return;
        }
    void setMode() {
        if(curr_mode_but == mode.run) {
            speed = walk_speed;
        } else setSpeed();
            return;
        }
    
}



