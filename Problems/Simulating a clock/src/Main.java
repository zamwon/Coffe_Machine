class Clock {

    int hours = 12;
    int minutes = 0;


    void next() { // 12 : 59
        if (this.minutes + 1 <= 59 && this.hours <= 12) {
            this.minutes = this.minutes + 1;
        } else if (this.minutes + 1 > 59 && this.hours < 12) {
            this.minutes = 0;
            this.hours = this.hours + 1;
        } else {
            this.minutes = 0;
            this.hours = 1;
        }
    }
}