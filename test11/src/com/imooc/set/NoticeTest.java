package com.imooc.set;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void main(String[] args) {
        Notice notice1 = new Notice(1, "欢迎来到召唤师峡谷", "管理员", new Date());
        Notice notice2 = new Notice(2, "欢迎个锤子", "臭弟弟", new Date());
        Notice notice3 = new Notice(3, "欢迎个瓜皮", "瓜瓜皮", new Date());

        ArrayList noticeList = new ArrayList();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);
        System.out.println("公告的内容：");

        //在指定位置添加公告
        //Notice notice4 = new Notice(4, "qwerdfvb", "k", new Date());
        //noticeList.add(2, notice4);
        //删除指定位置公告
        //noticeList.remove(2);
        //修改制定公告内容
        //notice3.setTitle("漫威之父");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice) (noticeList.get(i))).getTitle());
        }

    }
}