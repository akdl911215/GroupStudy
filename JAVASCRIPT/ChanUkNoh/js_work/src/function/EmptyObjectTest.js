const EmptyObjectTest = () => {
    let emptyObj = {}

    // 주의사항: 객체는 빈 객체더라도 if문에서 true로 처리된다.
    // 객체가 비어 있더라도 객체 자체가 존재하기 때문에
    // 존재 자체를 true로 인식하는 것이다.
    if (emptyObj) {
        console.log("true")
    } else {
        console.log("false")
    }

    return (
        <div className="Equals6">
            <p>
                Equals6
            </p>
        </div>
    )
}