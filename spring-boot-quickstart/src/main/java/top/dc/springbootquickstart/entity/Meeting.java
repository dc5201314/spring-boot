package top.dc.springbootquickstart.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class Meeting {
    private Long id;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    // Constructors, getters, and setters
    /**
     * 判断当前会议（this）与另⼀个会议（other）是否在同⼀天且时间上有重叠。
     *
     * @param other 要检查的另⼀个会议对象。
     * @return 如果两个会议在同⼀天且时间上有重叠，返回 true；否则返回 false。
     */
    public boolean isOverlapping(Meeting other) {
        // 检查两个会议是否在同⼀天
        return this.date.equals(other.date) &&
                // 检查当前会议的开始时间是否在其他会议的结束时间之前
                // 且当前会议的结束时间是否在其他会议的开始时间之后
                (this.startTime.isBefore(other.endTime) && this.endTime.isAfter(other.startTime));
    }
}

