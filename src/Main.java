public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //版本控制系统:VCS,Version control System
        //1.集中式版本控制系统:svn,subversion(向服务器提交,不能向自身提交)
        //2.分布式版本控制系统:Git(向服务器提交,也能向自身提交)


        //svn服务器:taoCode,SVNchina
        //Git服务器:gitee,github

        //Git使用

        //Git安装:
        //下载地址:https://git-scm.com/download/win

        //初始版本化
        //git init
        //注:当前文件夹,有文件要进行版本控制
        //(git:(master))


        //查看当前版本库的状态
        //git status

        //指定某个文件进行版本控制
        //git add 文件

        //红色:未进行版本控制
        //绿色:新增文件
        //蓝色:修改文件

        //git配置
        //git config --global user.name "姓名"
        //git config --global user.email "邮箱"
        //git config --global user.email "1971169846@qq.com"


        //删除git信息配置
        //git config --global --unset user.email


        //查看git信息配置
        //git config --global --list

        //注:
        //--system:系统
        //--global:当前用户
        //--local:当前仓库

        //提交修改
        //git commit -m "注释"

        //和上一个版本进行比较,查看修改文件信息
        //git diff 文件(比如:git diff src/Main.java)
        //注:按q退出查看

        //export LANG="zh_CN.UTF-8"
        //export LC_ALL="zh_CN.UTF-8"






    }
}
