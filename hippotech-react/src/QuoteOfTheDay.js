export default function QuoteOfTheDay(props) {
  return (
    <>
      <br/>
      <div dangerouslySetInnerHTML={{__html: props.quote}}/>
    </>
  );
}