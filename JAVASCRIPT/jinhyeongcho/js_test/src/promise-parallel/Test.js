const Test =() => {
    let sum = 0

    // 오늘 학습한 Promise를 사용해서
    // 현재 20초가량 소요되는 이 코드의 속도를 높여보자!
    // (아무런 의미없이 그냥 오래걸리는 녀석임)

    for(var i = 1; i <= 100000000;i++){
        sum += (i *0.000000001) *Math.sin(i*Math.PI/180)
        sum += (i *0.00000001)*Math.cos(i*Math.PI/180)
        sum += (i *0.0000001)*Math.sin(i*Math.PI/180)
        sum += (i *0.000001)*Math.cos(i*Math.PI/180)
        //sum += (i *0.00001)*Math.sin(i*Math.PI/180)
    }

    console.log(sum)

    return(
        <div className="Test">
            <p>
                Test
            </p>
        </div>
    )
}
export default Test