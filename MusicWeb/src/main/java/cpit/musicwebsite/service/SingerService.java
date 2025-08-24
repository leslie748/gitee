package com.example.musicwebsite.service;

import com.example.musicwebsite.model.Singer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SingerService {
    private List<Singer> singers;

    public SingerService() {
        // 初始化一些自定义歌手数据
        singers = new ArrayList<>();
        
        // 1. The Beatles（使用+拼接多行字符串）
        singers.add(new Singer(
            1L, 
            "The Beatles", 
            "/images/beatles.jpg", 
            "The Beatles，英国摇滚乐队，1960年成立于英格兰利物浦市，由约翰·列侬、林戈·斯塔尔、保罗·麦卡特尼和乔治·哈里森四名成员组成。\n" +
            "1962年发行首支单曲《Love Me Do》。1963年发行首张专辑《Please Please Me》，创下连续30周位居英国流行音乐专辑榜榜首的纪录。\n" +
            "1964年4月4日，创下包揽公告牌Hot 100单曲榜前5名的纪录；同年凭借歌曲《A Hard Day's Night》获得第7届格莱美最佳乐队奖。\n" +
            "1965年推出的歌曲《Yesterday》成为乐队具有代表性的作品之一。1966年发行迷幻摇滚风格的专辑《Revolver》。\n" +
            "1967年发行的专辑《Sgt. Pepper's Lonely Hearts Club Band》获得第10届格莱美年度最佳专辑奖。\n" +
            "1968年发行的单曲《Hey Jude》连续9周位居美国公告牌榜首。1969年进行最后一次公开演出；同年发行专辑《Abbey Road》。\n" +
            "1970年乐队解散。1980年12月8日，约翰·列侬去世。1988年进入摇滚名人堂。\n" +
            "1996年凭借单曲《Free As A Bird》获得第39届格莱美最佳流行乐队奖。2001年11月29日，乔治·哈里森去世。\n" +
            "2004年被《滚石》杂志选为“历史上最伟大的50位流行音乐家第一位”。\n" +
            "2008年在美国公告牌“最杰出音乐人Hot 100”榜单中名列榜首，同年以20首冠军单曲在公告牌“最多冠军单曲”榜单中排名第一。\n" +
            "2012年，英国官方排行榜公司公布了英国最畅销乐队排行榜，The Beatles名列榜首。"
        ));
        
        // 2. NIRVANA（使用+拼接多行字符串）
        singers.add(new Singer(
            2L, 
            "NIRVANA", 
            "/images/nirvana.jpg", 
            "Nirvana（涅槃乐队），美国摇滚乐队，由主唱兼吉他手科特·柯本、贝斯手克里斯特·诺沃塞利克、鼓手大卫·格鲁组成。\n" +
            "1987年，乐队在美国华盛顿州阿伯丁组建。1988年签约Sub Pop唱片。1989年发行首张录音室专辑《Bleach》。\n" +
            "1991年与格芬唱片公司签约，并发行录音室专辑《Nevermind》，该专辑的全球销量超过了3000万张。\n" +
            "1992年发行精选辑《Incesticide》。1993年获得第13届全英音乐奖最佳国际新晋音乐人奖，并发行录音室专辑《In Utero》。\n" +
            "1994年4月4日，科特·柯本自杀身亡，而乐队也因此解散。1995年获得第22届全美音乐奖最受欢迎重金属或硬摇滚艺人奖。\n" +
            "1996年凭借现场专辑《MTV Unplugged in New York》获得第38届格莱美奖最佳另类音乐表演奖。\n" +
            "2000年发行的单曲《Smells Like Teen Spirit》获得NME音乐奖的有史以来最佳单曲奖。\n" +
            "2014年入驻美国摇滚名人堂。2023年，获得第65届格莱美奖终生成就奖。"
        ));
        
        // 3. Guns N' Roses（修复末尾多余的逗号）
        singers.add(new Singer(
            3L, 
            "Guns N' Roses",  // 此处原代码多了一个逗号，已删除
            "/images/guns.jpg", 
            "枪炮与玫瑰乐队（Guns N' Roses），美国硬摇滚乐队，1985年组建于美国加利福尼亚州洛杉矶，现以艾克索·罗斯、Slash、达夫·麦克凯汉、迪齐·里德、理查德·福特斯、弗兰克·费雷尔、梅丽莎·瑞斯七名成员的组成形式展开活动。\n" +
            "1986年，与格芬唱片公司签约，此时乐队由艾克索·罗斯、Slash、达夫·麦克凯汉、艾斯·斯塔德林、史蒂文·阿德勒五名成员组成，该组成形式亦是乐队成立以来最经典的阵容。\n" +
            "1987年，发行首张录音室专辑《Appetite for Destruction》。该专辑获第17届全美音乐奖最受欢迎重金属或硬摇滚专辑。\n" +
            "1988年，发行第二张录音室专辑《G N' R Lies》，并入围第32届格莱美奖最佳硬摇滚表演。\n" +
            "1990年，获得第17届全美音乐奖最受欢迎重金属或硬摇滚艺人。1992年，获得第19届全美音乐奖最受欢迎重金属或硬摇滚艺人。\n" +
            "1993年获得第5届世界音乐大奖年度世界最畅销硬摇滚艺人、年度最佳乐队，此时，乐队的内部关系越来越紧张。\n" +
            "1996年，Slash宣布离队，随后达夫·麦克凯汉等多位成员先后离开，而艾克索·罗斯则成为了乐队商标持有者。\n" +
            "2012年入驻第27届摇滚名人堂。2016年，Slash、达夫·麦克凯汉等成员回归，乐队展开“此生无望”世界巡回演唱会。\n" +
            "2018年5月，发行十年来的首支单曲《Shadow of Your Love》；6月，发行《Appetite for Destruction： Locked N' Loaded》，该作品入围了第61届格莱美奖最佳盒装或特别限量版专辑包装。\n" +
            "2024年12月，维拉官方宣布枪炮与玫瑰将于2025年夏天在维拉公园球场演出。"
        ));
        
        // 4. U2（使用+拼接多行字符串）
        singers.add(new Singer(
            4L, 
            "U2", 
            "/images/u2.jpg", 
            "U2，爱尔兰摇滚乐队，由主唱保罗·大卫·休森（Bono）、吉他手大卫·荷威·伊凡斯（The Edge）、贝斯手亚当·克莱顿和鼓手拉里·木伦组成。\n" +
            "1976年，U2在爱尔兰都柏林成立。1980年，发行首张录音室专辑《Boy》。\n" +
            "1983年，发行录音室专辑《War》，该专辑获得了英国专辑榜的冠军。\n" +
            "1987年，发行专辑《The Joshua Tree》，该专辑全球销量超过2500万张，获得了第30届格莱美奖年度专辑奖。\n" +
            "1991年，发行录音室专辑《Achtung Baby》，该专辑的全球销量突破1800万。\n" +
            "1995年，献唱科幻片《永远的蝙蝠侠》主题曲《Hold Me, Thrill Me, Kiss Me, Kill Me》。"
        ));
    }

    public List<Singer> getAllSingers() {
        return singers;
    }

    public Optional<Singer> getSingerById(Long id) {
        return singers.stream().filter(singer -> singer.getId().equals(id)).findFirst();
    }
}
