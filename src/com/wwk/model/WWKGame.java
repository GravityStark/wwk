package com.wwk.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WWKGame {
    private String id;//一局游戏的唯一ID
    private Map<Integer,Joiner> joiners = new HashMap<>();//参与者
    private List<GameMsg> msgList = new ArrayList<>();//游戏记录
}
