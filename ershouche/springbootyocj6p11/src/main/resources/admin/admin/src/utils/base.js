const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootyocj6p11/",
            name: "springbootyocj6p11",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootyocj6p11/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "二手车交易系统"
        } 
    }
}
export default base
