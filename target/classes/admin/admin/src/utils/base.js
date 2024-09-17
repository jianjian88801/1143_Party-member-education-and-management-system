const base = {
    get() {
        return {
            url : "http://localhost:8080/dangyuanjiaoyuguanli/",
            name: "dangyuanjiaoyuguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/dangyuanjiaoyuguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "党员教育和管理系统"
        } 
    }
}
export default base
