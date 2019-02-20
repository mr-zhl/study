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

        //查看日志
        //git log

        //版本回退
        //git reset --hard 版本号
        //git reset --hard 8bf68
        //怎样回来:reflog

        //HEAD:当前的指向,最后一次提交

        //退回到HEAD的前一个指向
        //git reset --hard HEAD^
        //git reset --hard HEAD~100

        //查看所有日志
        //git reflog

        //工作区,暂存区,版本库,远程仓库
        //工作区:当前编辑的工程
        //站存区:当执行了git add后,文件会存入暂存区
        //版本库:当执行了git commit后,会把暂存区的文件提交到版本库
        //注:工作区,暂存区,版本库都在自己电脑上
        //暂存区,版本库,都在.git
        //远程仓库:git服务器

        //撤销修改
        //1.工作区:直接修改,或命令:git checkout -- 文件
        //2.暂存区:直接修改,再次add,或命令:git reset HEAD 文件
        //3.版本库:版本回退

        //删除文件:
        //git rm 文件

        //远程仓库
        //添加远程仓库
        //git remote add 仓库名 仓库地址
        //比如:git remote add github https://github.com/mr-zhl/study.git

        //把本地仓库推送到远程仓库
        //git push github master
        //git push gitee master

        //第一次如果初始失败
        //解决方案
        //远程仓库下载东西
        // git pull
        // git pull github master
        //git pull gitee master
        // git pull github master --allow-unrelated-histories
        // git pull gitee master --allow-unrelated-histories

        //查看远程仓库
        //git remote -v

        //产生远程仓库
        //git remote remove 仓库名

        //添加第二个远程地址时使用以下命令：
        //git remote set-url --add 仓库名 仓库地址

        //工作仓库
        //1.创建远程仓库
        //2.从远程仓库下载代码
        //3.修改代码并提交

        //分支管理

        //查看分支
        //git branch

        //创建分支
        //git branch 分支名

        //切换分支
        //git checkout 分支名

        //冲突
        //1,手动修改冲突代码
        //2.add.commit
        //3.再合并分支


        //git checkout -b 分支名


        //把Dev 合并到master中
        //1.切换到master
        //2.执行git merge dev

        //删除分支
        //git branch -d 分支名

        //git log --graph --all



        //保持当前工作区内容
        //git stash

        //查看保持内容
        //git stash list

        //恢复工作区内容
        //git stash apply

        //删除备份
        //git stash drop

        //恢复工作区内容,并删除备份
        //git stash pop


        //可视化操作




















    }
}
