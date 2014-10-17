package com.linuxgroup.homeschool.client.db.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.linuxgroup.homeschool.client.db.dao.impl.ChatMessageDaoImpl;
import com.linuxgroup.homeschool.client.db.dao.impl.RecentChatDaoImpl;

/**
 * Created by tan on 14-10-17.
 * 当前保存的会话
 * 保存的具体内容，比如 好友的昵称等，每次需要的时候，再从数据库读取
 */
@DatabaseTable(tableName = "recent_chat", daoClass = RecentChatDaoImpl.class)
public class RecentChat {
    @DatabaseField
    private String toAccount;
//    private String nick;
//    private String content;
//    private String time;

    @DatabaseField
    private boolean isRead;
}